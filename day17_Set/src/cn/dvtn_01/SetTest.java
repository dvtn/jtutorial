package cn.dvtn_01;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection
 *      |--List
 *          有序（存储顺序和取出顺序一致），可重复
 *      |--Set
 *          无序（存储顺序和取出顺序不一致），唯一
 *
 *  注意：虽然Set集合元素无序，但是，作为集合，它肯定有它自己的存储顺序。
 *  Set子类HashSet
 *  此类实现Set接口，由哈希表（实际上是一个HashMap实例)支持。它不保证set的迭代顺序；
 *  特别是它不保证该顺序恒久不变。
 */

public class SetTest {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();
        //创建并添加元素
        set.add("独孤求败");
        set.add("风清扬");
        set.add("东方不败");
        set.add("任我行");
        set.add("独孤求败");
        set.add("风清扬");
        set.add("东方不败");
        set.add("任我行");
        //增强for
        for(String s: set){
            System.out.println(s);
        }

        System.out.println("------------------");

    }
}
