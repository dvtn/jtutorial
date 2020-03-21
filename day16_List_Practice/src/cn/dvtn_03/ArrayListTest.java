package cn.dvtn_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 键盘录入多个数据，以0结束，要求在控制台输出这些个数中的最大值
 *
 * 分析：
 *  1.键盘录入多少数据不知道，用集合存储
 *  2.以0结束，只要键盘录入的数据是0，就不录数据
 *  3.把集合转成数组，对数组排序，获取数组中的最大索引值
 *
 */

public class ArrayListTest {
    public static void main(String[] args) {
        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);

        //创建集合
        ArrayList<Integer> list = new ArrayList<Integer>();

        //以0结束
        while(true){
            System.out.println("请录入数据：");
            int num = sc.nextInt();
            if(num!=0){
                list.add(num);
            } else {
                break;
            }
        }

        //把集合转成数组
        //public <T> T[] toArray(T[] a)
        //Integer[] i = new Integer[list.size()];
        //Integer[] ii = list.toArray(i);
        //System.out.println(i);
        //System.out.println(ii);//这两个打印的是同一个地址

        Integer[] i = new Integer[list.size()];
        list.toArray(i);

        Arrays.sort(i);

        System.out.println(i[i.length-1]);

    }
}
