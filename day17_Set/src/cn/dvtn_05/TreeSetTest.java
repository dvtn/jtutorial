package cn.dvtn_05;

import java.util.TreeSet;

/**
 * TreeSet: 基于TreeMap的NavigableSet实现
 *      使用元素的自然顺序对元素进行排序(自然排序Comparable）: compareTo方法，这个方法是定义在接口Comparable接口
 *      或者创建set时提供的Comparator进行排序，具体取决于构造方法（比较器排序Comparator)
 *
 *   排序并保证唯一性
 *
 * TreeSet集合特点：排序与唯一
 *
 * 构造方法
 * TreeSet(): 构造一个空set, 该set根据元素的自然顺序排序
 * TreeSet(Collection<? extends E> c> 构造一个包含指定元素的新TreeSet,它按照元素的自然顺序排序
 * TreeSet(Comparator<? supper E> comparator): 构造一个新的空TreeSet, 它根据指定比较器进行排序。
 *
 *
 * TreeSet的add()方法，最终要看TreeMap的put方法。
 *
 */

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //创建元素并添加
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(24);
        ts.add(19);
        ts.add(22);
        ts.add(24);
        ts.add(18);
        ts.add(24);

        for(Integer i: ts){
            System.out.println(i);
        }
    }
}
