package cn.dvtn_04;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet: 底层数据结构有哈希表和链表组成
 * 哈希表保证元素唯一性
 * 链表保证元素有序
 *
 * LinkedHashSet特点: 有序与唯一
 *
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Hello");
        lhs.add("World");
        lhs.add("Java");
        lhs.add("Android");
        lhs.add("Hello");
        lhs.add("World");
        lhs.add("Java");
        lhs.add("Android");

        for(String s: lhs){
            System.out.println(s);
        }
    }
}
