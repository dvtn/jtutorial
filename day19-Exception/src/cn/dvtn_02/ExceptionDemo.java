package cn.dvtn_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * 编译器异常与运行时异常的区别
 * 	编译期异常：Java程序必须处理，否则程序就会发生错误，无法通过编译
 * 	运行期异常：无需显式处理，也可以和编译时异常一样处理
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        String s = "2019-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
