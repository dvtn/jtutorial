package cn.dvtn_03;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;


/**
 * 静态导入：
 *
 * 格式： import static 包名...类名.方法名;
 * 可以直接导入方法级别
 *
 * 静态导入的注意事项
 *      1.方法必须是静态的
 *      2.如果有多个同名的静态方法，容易不知道使用谁？这个时候要使用，必须加前缀。
 *          由此可见，一样不大方便，所以一般不用。
 *
 */

public class StaticImport {
    public static void main(String[] args) {

        //太复杂，我们就引入到import java.lang.Math;
        System.out.println(java.lang.Math.abs(-200));
        System.out.println(java.lang.Math.pow(2,3));
        System.out.println(java.lang.Math.max(500,900));

        //太复杂，有更简单的吗
        System.out.println(Math.abs(-200));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.max(500,900));

        System.out.println(abs(-200));
        System.out.println(pow(2,3));
        System.out.println(max(500,900));

    }

    //public static void abs(String s){
    //    System.out.println(s);
    //}
}
