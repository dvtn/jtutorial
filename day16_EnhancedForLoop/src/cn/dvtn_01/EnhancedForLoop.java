package cn.dvtn_01;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK5的新特性：自动拆装箱，泛型，增强for, 静态导入，可变参数，枚举
 *
 * 增强for: 是for循环的一种。
 *
 * 格式：
 *      for(元素数据类型 变量: 数组或者Collection集合){
 *          使用变量即可，该变量就是元素
 *      }
 *
 *
 *  好处：简化了数组和集合的遍历
 *  弊端：增加for遍历的目标不能为null
 *
 *  解决办法：对目标先判断
 *
 *
 */

public class EnhancedForLoop {
    public static void main(String[] args) {
        //定义一个数组
        int[] array  = {1,2,3,4,5,6,7,8,9,10};

        //以前的遍历方式
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //增加for
        for(int elem: array){
            System.out.println(elem);
        }


        //定义一个字符串数据
        String[] namesArray = {"独孤求败","风清扬","任我行","东方不败","令狐冲","张三丰"};
        //增加for
        for(String name:namesArray){
            System.out.println(name);
        }

        //定义一个集合
        List<String> list = new ArrayList<String>();
        list.add("唐僧");
        list.add("孙行者");
        list.add("猪无能");
        list.add("沙各尚");
        list.add("白龙马");
        //增加for
        for(String s: list){
            System.out.println(s);
        }


        //不好的地方
        List<String> list1 = null;
        //java.lang.NullPointerException
        //这个s是我们从list里面获取出来的，在获取前，最好做一个判断
        //这就是迭代器的功能
        if(list1!=null)
        for(String s:list1){

            System.out.println(s);
        }

        //其实，增强for循环是用来替换迭代器的
        for(String s: list){
            if("唐僧".equals(s)){
                list.add("如来佛祖");
            }
        }
        System.out.println(list); //java.util.ConcurrentModificationException
    }
}
