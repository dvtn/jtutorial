package cn.dvtn_02;

import java.util.HashSet;

/**
 * HashSet存储字符串并遍历
 *
 * 能过查看add的源码这个方法底层依赖两个方法：hashCode()和equals()
 * 步骤：
 *      首先比较哈希值
 *      如果相同，继续走，比较地址值或者equals方法
 *      如果不同，添加到集合中
 */

public class HashSetTest {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();
        //新建元素并添加
        hs.add("独孤求败");
        hs.add(("风清扬"));
        hs.add("东方不败");
        hs.add("任我行");
        hs.add("独孤求败");
        hs.add(("风清扬"));
        hs.add("东方不败");
        hs.add("任我行");
        //遍历
        for(String s: hs){
            System.out.println(s);
        }

    }
}
