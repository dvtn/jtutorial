package cn.dvtn_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections可以针对ArrayList存储基本包装类元素可以排序，存储自定义对象可不可以排序呢？
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("林青霞",27);
        Student s2 = new Student("风清扬", 30);
        Student s3 = new Student("东方不败", 26);
        Student s4 = new Student("任我行", 43);
        Student s5 = new Student("风清扬", 30);

        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //自然排序, Student需要实现Comparable接口，
        Collections.sort(list);

        //比较器排序
        //如果同时有自然排序和比较器排序，那么哪个优先级更高呢？
        //结果：比较器排序优先级高

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for(Student s: list){
            System.out.println(s.getName()+"---"+s.getAge());
        }



    }
}
