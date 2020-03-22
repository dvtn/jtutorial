package cn.dvtn_07;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().length()-o2.getName().length();
        int num2 = num==0?o1.getName().compareTo(o2.getName()):num;
        int num3 = num2==0?o1.getAge()-o2.getAge():num2;
        return num3;
    }
}
