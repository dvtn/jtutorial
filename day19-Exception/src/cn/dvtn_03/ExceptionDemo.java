package cn.dvtn_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 在try里面发现问题后，jvm会帮我们生成一个异常对象，把这个对象抛出，和catch里面的类进行匹配
 * 如果该对象是某个类型的，就会执行该catch里面的处理信息
 *
 * 异常中要了解的几个方法：
 *		public String getMessage(): 异常的消息串
 *		public String toString(): 返回该异常的简单信息描述
 *			1) 些对象的类名name（全路径名）
 *			2) ": "(冒号空格)
 *			3) 调用此对象getLocalizedMessage()方法结果 （如果不重写，默认返回的是getMessage()的内容)
 *
 *		public void printStackTrace(): 获取异常名和异常信息，以及异常出现在程序中的位置。返回值void
 *
 */

public class ExceptionDemo {
    public static void main(String[] args) {

        String s = "2019-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("-----------getMessage()------");
            System.out.println(e.getMessage());
            System.out.println("-----------toString()------");
            System.out.println(e.toString());
            System.out.println("-----------printStackTrace()------");
            e.printStackTrace();
        }

        System.out.println("over...");

    }
}
