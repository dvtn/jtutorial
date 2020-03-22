package cn.dvtn_02;

import java.util.HashSet;

/**
 * HashSet存储字符串并遍历
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
