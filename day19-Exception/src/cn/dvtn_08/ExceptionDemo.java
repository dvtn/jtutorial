package cn.dvtn_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 异常注意事项
 * 1. 子类覆盖(重定)父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
 * 2. 如果父类抛出了多个异常，子类重写父类方法时，只能抛出相同的异常或者是他的子集，子类不能招聘父类没有的异常
 * 3. 如果被重写的方法没有抛出异常，那么子类的方法绝对不可以抛出异常，如果子类方法内有异常发生，那么子类只能try,不能throws
 *
 */

public class ExceptionDemo {

}

class Fu{
    public void show() throws Exception{

    }
    public void method() {

    }
}

class Zi extends Fu{
    public void show() throws Exception{

    }

    @Override
    public void method()  {
        String s = "2019-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d=null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
