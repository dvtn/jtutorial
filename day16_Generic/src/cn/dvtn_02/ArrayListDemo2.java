package cn.dvtn_02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList存储自定义对象并遍历（泛型版)
 *
 * 步骤：
 * 1.创建人类
 * 2.创建集合对象
 * 3.创建Person对象
 * 4.把Person对象添加到集合
 * 5.遍历输出
 */

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //创建集合
        ArrayList<Person> array = new ArrayList<Person>();
        //创建Person对象
        Person p1 = new Person("独孤求败", 60 );
        Person p2 = new Person("风清扬",45);
        Person p3 = new Person("东方不败", 34);
        Person p4 = new Person("任我行",50);
        //把Person对象添回到集合
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);

        //遍历
        Iterator<Person> it = array.iterator();
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p.getName()+"---"+p.getAge());
        }

        System.out.println("----------------------------------");

        //for循环
        for (int i = 0; i < array.size(); i++) {
            Person p = array.get(i);
            System.out.println(p.getName()+"------"+p.getAge());

        }
    }
}
