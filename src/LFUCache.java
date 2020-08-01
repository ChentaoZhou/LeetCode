import java.util.HashMap;
import java.util.Map;

class LFUCache {
	//先定义节点
	class Node{
		int key,val,cnt;
		Node pre, next;
		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			cnt=1;
		}
		public Node() {cnt=1;}
	}
	//双链表类以及对应的方法
	class DLList{
		Node dummyHead, dummyTail;
		int size;
		public DLList() {
			dummyHead = new Node();
			dummyTail = new Node();
			dummyHead.next = dummyTail;
			dummyTail.pre  = dummyHead;
		}
		public void addToHead(Node node) {
			node.pre = dummyHead;
			node.next = dummyHead.next;
			dummyHead.next.pre = node;
			dummyHead.next = node;
			size++;
		}
		public void remove(Node node) {
			node.pre.next = node.next;
			node.next.pre = node.pre;
			size--;
		}
		public Node removeTail() {
			if(size>0) {
				Node node = dummyTail.pre;
				remove(node);
				return node;
			}
			return null;
		}	
	}
	//声明LFUCache类的变量及方法
	int capacity,size,min;
	Map<Integer, Node> nodeMap;
	Map<Integer, DLList> countMap;
	
    public LFUCache(int capacity) {
       this.capacity = capacity;
       nodeMap = new HashMap<>();
       countMap = new HashMap<>();
    }
    
    public int get(int key) {
        Node node = nodeMap.get(key);
        if(node==null) return -1;
        update(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
        Node node;
        if(nodeMap.containsKey(key)) {
        	node = nodeMap.get(key);
        	node.val = value;
        	update(node);
        }
        else {
        	node = new Node(key,value);
        	nodeMap.put(key, node);
        	if(size == capacity) {
        		DLList minList = countMap.get(min);
        		nodeMap.remove(minList.removeTail().key);
        		size--;
        	}
        	size++;
        	min=1;	//将min值重新设置为1
        	DLList newList = countMap.getOrDefault(node.cnt,new DLList());
        	newList.addToHead(node);
        	countMap.put(node.cnt,newList);
        	
        }
    }
    
    public void update(Node node) {
    	//先通过node的频率，获得存在countMap中对应的双链表
    	DLList oldList = countMap.get(node.cnt);
    	oldList.remove(node);
    	if(node.cnt==min && oldList.size == 0) min++;
    	node.cnt++;
    	//获得node当前频率对应的双链表，若没有就创建一个新的并将node插在链表头
    	DLList newList = countMap.getOrDefault(node.cnt, new DLList());
    	newList.addToHead(node);
    	countMap.put(node.cnt, newList);
    }
}





/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */