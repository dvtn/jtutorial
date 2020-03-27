package cn.dvtn_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * throws方式处理异常
 * 	有些时候，我们是可以对异常进行处理的，但是有些时候，我们根据没有权限去处理某些异常
 * 	或者说，我处理不了，我就不处理了。
 * 	为了解决出错问题，Java针对这种情况，就提供了另一种处理方案：抛出。
 *
 * 格式：
 * 		throws 异常类名
 * 		注意： 这个格式必须跟在方法的括号后面
 *
 * 小结：
 * 		编译期异常抛出，将来调用者必须要处理。
 * 		运行期异常抛出，调用都可以不处理。
 *
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("今天天气不错");
        try {
            method();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("但是不该有霾");

        try {
            method2();
        } catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //编译期异常不需要处理
    }

    //在方法声明上抛出是为了告诉调用者，你要注意了，我有问题
    public static void method() throws ParseException {
        String s = "2019-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    public static void method2() throws ArithmeticException, Exception {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
}