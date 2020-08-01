import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class DLinkedNode{
    	int key;
    	int value;
    	DLinkedNode pre;
    	DLinkedNode next;
    	public DLinkedNode() {}
    	public DLinkedNode(int key, int value) {this.key = key; this.value = value;}
    }
    Map<Integer,DLinkedNode> map = new HashMap<>();
    int size;
    int capacity;
    DLinkedNode dummyhead,dummytail;
    
    public LRUCache(int capacity) {
        this.size=0;
        this.capacity = capacity;
        dummyhead = new DLinkedNode();
        dummytail = new DLinkedNode();
        dummyhead.next = dummytail;
        dummytail.pre = dummyhead;
    }
    
    public int get(int key) {
        DLinkedNode res = map.get(key);
        if(res==null) {
        	return -1;
        }
        moveToHead(res);
        return res.value;
    }
    
    public void put(int key, int value) {
    	DLinkedNode res = map.get(key);
        if(res!=null) {
        	res.value = value;
        	moveToHead(res);
        }else {
        	DLinkedNode node = new DLinkedNode(key,value);
        	map.put(key,node);
        	addToHead(node);
        	size++;
        	if(size>capacity) {
        		DLinkedNode tail = removeTail();
        		map.remove(tail.key);
        		size--;
        	}
        }
    }
    
    private void addToHead(DLinkedNode node) {
    	node.pre = dummyhead;
    	node.next = dummyhead.next;
    	dummyhead.next.pre = node;
    	dummyhead.next = node;
    }
    private void removeNode(DLinkedNode node) {
    	node.pre.next = node.next;
    	node.next.pre = node.pre;
    }
    private void moveToHead(DLinkedNode node) {
    	removeNode(node);
    	addToHead(node);
    }
    private DLinkedNode removeTail() {
    	DLinkedNode res = dummytail.pre;
    	System.out.println("remove: "+res.key);
    	removeNode(res);
    	return res;
    }
    
    public static void main(String[] args) {
    	LRUCache cache = new LRUCache(2);
    	cache.put(2, 1);
    	cache.put(1,1);
    	cache.put(2, 3);
    	System.out.println("111111");
    	cache.put(4, 1);
    	System.out.println("22222");
    	System.out.println(cache.map.keySet());
    	//System.out.println(cache.get(1));
    	//System.out.println(cache.get(2));
    }
    
    
    
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */