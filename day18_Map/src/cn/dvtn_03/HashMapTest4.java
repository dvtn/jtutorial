package cn.dvtn_03;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<Student, String>
 *
 * 如果两个成员变量值相同，则为同一个对象
 *  在Student类中重写equals()与hashCode()方法
 *
 */

public class HashMapTest4 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Student, String> hm = new HashMap<>();

        //创建并添加元素
        Student s1 = new Student("独孤求败", 60);
        Student s2 = new Student("风清扬", 45);
        Student s3 = new Student("东方不败",35);
        Student s4 = new Student("任我行", 48);
        Student s5 = new Student("张三丰", 80);
        Student s6 = new Student("独孤求败", 60);

        hm.put(s1, "wx0001");
        hm.put(s2, "wx0005");
        hm.put(s3, "wx0003");
        hm.put(s4, "wx0004");
        hm.put(s5, "wx0002");
        hm.put(s6, "wx0003");

        Set<Student> set = hm.keySet();
        for(Student key:set){
            String value = hm.get(key);
            System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
        }


    }
}
