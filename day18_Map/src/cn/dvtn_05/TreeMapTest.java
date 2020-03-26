package cn.dvtn_05;

import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap类概述
 *  键是红轩树结构，可以保证键的排序和唯一性
 *
 *  TreeMap<String, String>示例
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();

        //创建元素并添加
        tm.put("hello","你好");
        tm.put("world","世界");
        tm.put("java","爪哇");
        tm.put("world","世界2");
        tm.put("javaee","爪哇EE");

        Set<String> set = tm.keySet();
        for(String key: set){
            String value = tm.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
