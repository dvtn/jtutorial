package cn.dvtn_06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * finally:
 * 	格式：try{}catch(){}finally{}
 *
 * 	特点：
 * 		1.被finally控制的语句体一定会执行
 * 		2.特殊情况：在执行到finally之前jvm退出了（比如System.exit(0)), 就不能执行了
 *  作用：
 *  	用于释放资源，在IO流操作和数据库操作中会见到
 *  面试题：
 *  1.final, finally和finalize的区别?
 *  	final: 最终的意思。
 *  		可以修饰类: 类不能被继承
 *  		成员变量: 变量是常量
 *  		成员方法: 方法不能被重写
 *  	finally: 是异常处理的一部分，用于释放资源。一般来说在，代码肯定会执行。特殊情况在执行到finally之前，jvm退出了。
 *  	finalize(): 是Object类的一个方法，用于垃圾回收。
 *
 *  2.如果catch里面有return语句，请问finally的代码还会执行吗？如果会，请问是在return之前还是之后？
 *  会，前，准确地说在return中间执行
 *
 *
 *  3. try...catch...finally的格式变形
 *  	1) try...catch...finally
 *  	2) try...catch
 *  	3) try... catch ...catch...
 *  	4) try ...catch ...catch...finally
 *  	5) try...finally: 这种做法的目的是为了释放资源
 *
 *
 */

public class FinallyDemo {
    public static void main(String[] args) {

        System.out.println(getInt());


        String s = "2019-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //			System.exit(0);
        } finally {
            System.out.println("这里的代码一定会执行");
        }
        System.out.println(d);
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a/0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /**
             * return a在程序执行到这一步时，这里不是return a而是return 30这个返回路径就形成了。
             * 但是，它发现后面还有finally, 所以继续执行finally的内容，a=40;
             * 再次回到以前的返回路径，继续走return 30;
             */
        } finally {
            a = 40;
            //			return a;//如果这样结果就是40
        }
        return a;
    }
}

