package cn.dvtn_03;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<Integer, String>
 */
public class HashMapTest2 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Integer, String> hm = new HashMap<>();

        //创建添加元素
        //Integer i = new Integer(27);
        //Integer i = 27;
        //String s = "独孤求败";
        //hm.put(i,s);

        hm.put(27, "独孤求败");
        hm.put(30,"风清扬");
        hm.put(28,"任我行");
        hm.put(29, "独孤求败");

        //下面写法是8进制，但是不能出现8及以上的单个数字
        //hm.put(006, "hello");
        //hm.put(007, "hello");
        //hm.put(008, "hello"); //报错，0开头是八进制
        Set<Integer> set = hm.keySet();
        for(Integer key:set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }


    }
}
