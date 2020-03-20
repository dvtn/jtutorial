package cn.dvtn_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList存储字符串并遍历三种方式。
 *
 * A: 迭代器
 * B: 普通for
 * C: 增强for
 *
 */

public class ArrayListDemo {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<String>();

        //添加元素
        arrayList.add("唐僧");
        arrayList.add("孙行者");
        arrayList.add("猪无能");
        arrayList.add("沙各尚");
        arrayList.add("白龙马");

        //1.迭代器遍历
        for(Iterator<String> it = arrayList.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

        //2.普通for
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }

        //增强for
        for(String s: arrayList){
            System.out.println(s);
        }



    }
}
