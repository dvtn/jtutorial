package cn.dvtn_07;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet保证元素唯一性和比较器排序(Comparator)
 *
 * TreeSet(Comparator<? super E> comparator): 比较器排序
 *  构造一个新的，空的树集，根据指定的比较器进行排序。
 *
 */

public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合对象
        //TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
        //如果一个方法的参数是接口，那么真正的是接口的实现类
        //而匿名内部类就可以实现这个东西
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().length()-o2.getName().length();
                int num2 = num==0?o1.getName().compareTo(o2.getName()):num;
                int num3 = num2==0?o1.getAge()-o2.getAge():num2;
                return num3;
            }
        });

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
