## 生成随机数

三个方法

- `java.util.Random `  class
- `Math.random`  方法，创建一个double类型的随机数
- `ThreadLocalRandom` class

#### java.util.Random

- 要使用这个方法，首先要生成一个实例。来调用它的`nextInt()`,` nextDouble()`, `nextLong()` 等等
- 我们可以使用这个类来生成随机的 integer, float, double, long, booleans
- 我们可以传递一个参数到这个方法里，来设置一个范围的上限。例如，nextInt(6)将生成范围从0到5(包括0到5)的数字。

``` java
import java.util.Random; 
  
public class generateRandom{ 
  
    public static void main(String args[]) 
    { 
        // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2); 
  
        // Generate Random doubles 
        double rand_dub1 = rand.nextDouble(); 
        double rand_dub2 = rand.nextDouble(); 
  
        // Print random doubles 
        System.out.println("Random Doubles: "+rand_dub1); 
        System.out.println("Random Doubles: "+rand_dub2); 
    } 
} 
//output:
Random Integers: 547
Random Integers: 126
Random Doubles: 0.8369779739988428
Random Doubles: 0.5497554388209912
```



#### Math.random()

- Math 这个类包含了很多有关数字操作的的方法，例如：计算指数、对数等。其中一个方法是random()，该方法返回一个正数的 double，大于或等于0.0，小于1.0。
- 此方法只能生成 double 类型的随机数