package cn.dvtn_07;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Hashtable和HashMap的区别？
 *  Hashtable:线程安全，效率低；不允许null键和null值
 *  HashMap:线程不安全，效率高；允许null键和null值
 *
 * List, Set, Map等接口是否都继承自Map接口？
 *  List, Set不是继承自Map接口，它们继承自Collection接口
 *  Map接口本身就是一个基层接口
 */

public class HashtableTest {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("it001","hello");
        hm.put(null, "world");
        hm.put("it002",null);
        System.out.println(hm);

        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("it001","hello");
        //ht.put(null, "world"); //报错
        //ht.put("it002",null); //报错
        System.out.println(hm);
    }
}
