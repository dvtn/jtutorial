package cn.dvtn_06;

import java.util.TreeSet;

/**
 * TreeSet存储自定义对象并保证排序和唯一
 *
 * java.lang.ClassCastException: cn.dvtn_06.Student cannot be cast to java.lang.Comparable
 * 1.没有定义排序规则
 *      -> 自然排序，按照年龄从小到大排序
 * 2.元素什么情况下算唯一
 *      -> 成员变量值都相同算同一个元素
 */

public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建元素
        Student s1 = new Student("独孤求败", 27);
        Student s2 = new Student("风清扬", 29);
        Student s3 = new Student("任我行", 23);
        Student s4 = new Student("独孤求败", 27);
        Student s5 = new Student("东方不败", 28);
        Student s6 = new Student("成坤", 22);
        Student s7 = new Student("风清扬", 22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历
        for(Student student:ts){
            System.out.println(student.getName()+"---"+student.getAge());
        }


    }
}
