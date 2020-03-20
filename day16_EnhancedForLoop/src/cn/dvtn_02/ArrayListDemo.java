package cn.dvtn_02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList存储自定义对象并遍历三种方式。
 *
 * A: 迭代器
 * B: 普通for
 * C: 增强for
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Human> arrayList = new ArrayList<Human>();

        //创建Person对象并添加到集合中
        Human p1 = new Human("宋江", 60);
        Human p2 = new Human("卢俊义",45);
        Human p3 = new Human("吴用", 42);
        Human p4 = new Human("林冲", 28);
        Human p5 = new Human("鲁智深",34);
        Human p6 = new Human("武松",29);

        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);

        //1.迭代器遍历
        Iterator<Human> it = arrayList.iterator();
        while(it.hasNext()){
            Human p = it.next();
            System.out.println(p.getName()+"---"+p.getAge());
        }

        System.out.println("********************************");

        //2.普通for遍历
        for (int i = 0; i < arrayList.size(); i++) {
            Human p = arrayList.get(i);
            System.out.println(p.getName()+"@@@"+p.getAge());

        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //增强for
        if(arrayList!=null) {
            for (Human p : arrayList) {
                System.out.println(p.getName() + "###" + p.getAge());
            }
        }
    }
}
