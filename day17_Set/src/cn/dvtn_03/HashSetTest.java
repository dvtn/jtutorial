package cn.dvtn_03;

import java.util.HashSet;

/**
 * 存储自定义对象，并保证元素唯一性
 * 需求：如果两个对象的成员变量相同，则为同一个元素
 *
 * 目前是不符合要求的，因为HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两上方法在学生类中没有重写，默认使用的是Object类。
 * 如果哈希值相同，就判断equals()
 *
 *
 */

public class HashSetTest {
    public static void main(String[] args) {
        //创建集合
        HashSet<Student> hs = new HashSet<Student>();
        //创建学生对象
        Student s1 = new Student("独孤求败",60);
        Student s2 = new Student("独孤求败",50);
        Student s3 = new Student("风清扬",40);
        Student s4 = new Student("风清扬",40);
        Student s5 = new Student("任我行",60);
        Student s6 = new Student("任我行",60);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        for(Student student:hs){
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}
