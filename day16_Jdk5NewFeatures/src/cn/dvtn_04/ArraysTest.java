package cn.dvtn_04;

import java.util.Arrays;
import java.util.List;

/**
 * public static <T> List<T> asList(T...a): 把数组转成集合
 *
 * 注意事项：虽然可以把数组转成集合，但是集合的长度不能改变。
 */

public class ArraysTest {
    public static void main(String[] args) {
        //定义一个数组
        //String[] strArray= {"独孤求败", "风清扬", "任我行","东方不败"};

        List<String> list = Arrays.asList("独孤求败", "风清扬", "任我行","东方不败");

        //java.lang.UnsupportedOperationException
        //list.add("令狐冲");
        //java.lang.UnsupportedOperationException
        //list.remove(1);
        list.set(1,"乔峰");
        for(String s: list){
            System.out.println(s);
        }
    }
}
