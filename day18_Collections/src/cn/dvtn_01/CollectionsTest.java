package cn.dvtn_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections类概述
 *  针对集合操作的工具类,都是静态方法
 *
 * 面试题:
 *  Collection和Collections的区别？
 *      Collection：是单列集合的顶层接口，有子接口List和Set。
 *      Collections: 是针对集合操作的工具类，有对集合进行排序和二分查找的方法。
 *
 *
 * Collections常用成员方法
 *  public static <T> void sort(List<T> list):排序(默认自然排序)
 *  public static <T> int binarySearch(List<?> list, T key): 二分查找
 *  public static <T> T max(Collection<?> coll) : 最大值
 *  public static void reverse(List<?> list): 反转
 *  public static void shuffle(List<?> list): 随机置换
 */

public class CollectionsTest {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:"+list);

        //public static <T> void sort(List<T> list):排序(默认自然排序)
        Collections.sort(list); //Integer默认实现了Comparable接口
        System.out.println("list:"+list);

        ////public static <T> int binarySearch(List<?> list, T key): 二分查找
        //System.out.println("binarySearch:"+Collections.binarySearch(list, 30));
        //System.out.println("binarySearch:"+Collections.binarySearch(list, 300));

        ////public static <T> T max(Collection<?> coll) : 最大值
        //System.out.println("max:"+Collections.max(list));

        ////public static void reverse(List<?> list): 反转
        //Collections.reverse(list);
        //System.out.println("reverse:"+list);

        //public static void shuffle(List<?> list): 随机置换
        Collections.shuffle(list);
        System.out.println("shuffle:"+list);

    }
}
