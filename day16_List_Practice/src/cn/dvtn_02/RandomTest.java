package cn.dvtn_02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 获取10个1~20间的随机数，要求不能重复
 *
 * 思路：
 *  1.创建产生随机数对象
 *  2.创建存储随机数的集合
 *  3.定义一个统计变量，从0开始。
 *  4.看统计变量是否小于10：
 *      是：先产生一个随机数，判断该随机数在集合中是否存在。如果不存在，就添加，统计变量++。如果不存在，不处理
 *      否：不处理
 *  5.遍历集合
 *
 */

public class RandomTest {
    public static void main(String[] args) {
        //创建产生随机数的对象
        Random r = new Random();

        //创建一个存储随机数的集合
        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        while (count < 10){
            int num = r.nextInt(20)+1;
            //判断是否存在
            if(!list.contains(num)){
                list.add(num);
                count++;
            }

        }

        //遍历集合
        for(Integer i: list){
            System.out.println(i);
        }

    }
}
