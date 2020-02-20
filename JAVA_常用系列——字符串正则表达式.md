## 各种常用字符串正则表达式

``` java
//string去除空格
        String str="  hello   world  ";
        System.out.println(str);
 
        String str1=str.trim();//去除首尾空格
        System.out.println(str1);
 
        String str2=str.replace(" ","");//去掉所有空格,包括首尾,中间
        System.out.println(str2);
 
        String str3=str.replaceAll(" +","");//去掉所有空格,包括首尾,中间
        System.out.println(str3);
 
        String str4=str.replaceAll("\\s*",""); //可以替换大部分空白字符， 不限于空格 . 说明:\s 可以匹配空格、制表符、换页符等空白字符的其中任意一个
        System.out.println(str4);
 
        //string去除标点符号
        //正则表达式去除标点
        String stri="ss&*(,.~1如果@&(^-自己!!知道`什`么#是$苦%……Z，&那*()么一-=定——+告诉::;\"'/?.,><[]{}\\||别人什么是甜。";
        System.out.println(stri);
 
        String stri1=stri.replaceAll("\\p{Punct}","");//不能完全清除标点
        System.out.println(stri1);
 
        String stri2=stri.replaceAll("\\pP","");//完全清除标点
        System.out.println(stri2);
 
        String stri3=stri.replaceAll("\\p{P}","");//同上,一样的功能
        System.out.println(stri3);
 
        String stri4=stri.replaceAll("[\\pP\\p{Punct}]","");//清除所有符号,只留下字母 数字  汉字  共3类.
        System.out.println(stri4);

```

