package cn.dvtn_08;

import java.util.HashSet;
import java.util.Random;

/**
 * 编写一个程序，获取10个1~20的随机数，要求随机数不能重复
 *
 * 分析：
 *  1.创建随机数对象
 *  2.创建一个Set集合
 *  3.判断集合的长度是否小于10
 *      是：创建并添加随机数
 *      不是：不有处理
 *  4.遍历集合
 */
public class HashSetTest {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //创建一个Set集合
        HashSet<Integer> hs = new HashSet<>();

        //判断集合长度是否小于10
        while(hs.size()<10){
            hs.add(r.nextInt(20)+1);
        }

        //遍历集合
        for(Integer i: hs){
            System.out.println(i);
        }
    }
}
