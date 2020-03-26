package cn.dvtn_04;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * LinkedHashMap:
 *  Map接口的哈希表和链表实现，具有可预知的迭代顺序。
 */

public class LinkedHashMapTest {
    public static void main(String[] args) {
        //定义集合
        LinkedHashMap<String, String> hm = new LinkedHashMap<>();
        //创建并添加元素
        hm.put("2345","hello");
        hm.put("1234","java");
        hm.put("3456","java");
        hm.put("1234","javaee");
        hm.put("3456","android");

        //遍历
        Set<String> set = hm.keySet();
        for(String key:set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }


    }
}
