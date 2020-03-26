package cn.dvtn_03;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<String, Student>
 */
public class HashMapTest3 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, Student> hm = new HashMap<>();

        //创建并添加元素
        Student s1 = new Student("独孤求败", 60);
        Student s2 = new Student("风清扬", 45);
        Student s3 = new Student("东方不败",35);
        Student s4 = new Student("任我行", 48);
        Student s5 = new Student("张三丰", 80);

        hm.put("wx0001", s1);
        hm.put("wx0005", s2);
        hm.put("wx0003", s3);
        hm.put("wx0004", s4);
        hm.put("wx0002", s5);

        Set<String> set = hm.keySet();
        for(String key: set){
            Student s = hm.get(key);
            System.out.println(key+"---"+s.getName()+"---"+s.getAge());
        }

    }
}
