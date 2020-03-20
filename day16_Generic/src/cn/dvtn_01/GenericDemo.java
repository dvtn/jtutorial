package cn.dvtn_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList存储字符串并遍历
 * <p>
 * 我们按照正常的写法来写这个程序，结果确出错了。为什么呢？
 *      因为我们开始存储的时候，存储了String和Integer两种类型的数据。而在遍历的时候，我们把它们都当作String类型处理的，做了转换，所以就报错了。
 * <p>
 * 但是，它在编译时间却没有告诉我们。请看黄色警告线。
 * 回想一下我们的数据：
 *      String[] strArray = new String[3];
 *      strArray[0] = "hello";
 *      strArray[1] = "world";
 *      strArray[2] = 10;
 *
 * 集合也模仿着数据这种做法，在创建对象的时候明确元素的数据类。这样就不会再有问题了。这种技术被称为：泛型。
 *
 * 泛型: 是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。也叫做参数化类型，把类型当作参数一样的传递。
 * 格式：<数据类型>  此处的数据类型只能是引用类型
 *
 * 好处：
 *     1.把运行时期的问题提前到了编译期间
 *     2.避免了强制类型转换
 *     3.优化了程序设计,解决了黄色警告线
 *
 */

public class GenericDemo {
    public static void main(String[] args) {
        ////创建
        //ArrayList array = new ArrayList();
        //
        ////添加元素
        //array.add("独孤求败");
        //array.add("风清扬");
        //array.add("东方不败");
        //array.add("任我行");
        ////array.add(new Integer(10));
        //array.add(10); //JDK5以后的自动装箱  //等价于: array.add(Integer.valueOf(10));
        //
        //Iterator it = array.iterator();
        //while (it.hasNext()) {
        //    String s = (String) it.next();
        //    System.out.println(s);
        //}
        //
        //// 看下面这个代码
        ////String[] strArray = new String[3];
        ////strArray[0] = "hello";
        ////strArray[1] = "world";
        ////strArray[2] = 10;


        //创建
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("独孤求败");
        array.add("风清扬");
        array.add("东方不败");
        array.add("任我行");
        //array.add(new Integer(10));
        //array.add(10); //JDK5以后的自动装箱  //等价于: array.add(Integer.valueOf(10));

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            //String s = (String) it.next();
            String s = it.next();
            System.out.println(s);
        }

    }
}
