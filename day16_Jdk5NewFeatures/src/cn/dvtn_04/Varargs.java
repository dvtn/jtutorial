package cn.dvtn_04;

/**
 * 可变参数的概述和使用
 *
 *  可变参数：定义方法时不知道该定义多少个参数
 *  格式：
 *      修饰符  返回值类型  方法名(数据类型...变量名){}
 *
 *  注意：
 *      1.这里的变量其实是一个数组
 *      2.如果一个方法有可变参数，并且有多个参数，那么可变参数肯定是最后一个
 *
 *
 *  示例：Arrays工具类中的一个方法(public static <T> List<T> asList(T...a)
 *
 *
 */

public class Varargs {
    public static void main(String[] args) {
        //2个求和
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);

        //3个求和
        a = 10;
        b = 20;
        int c = 30;
        result = sum(a, b, c);
        System.out.println(result);

        //需求：不知道有多少个数求和，只有在调用的时候知道
        //为了解决这个问题，java提供了一个新特性：可变参数
        result = sum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(result);

    }

    private static int sum(int ... a){
        //System.out.println(a); //知道是个数组
        int s = 0;
        for(int x:a){
            s += x;
        }
        return s;
    }

    //private static int sum(int a, int b, int c) {
    //    return a + b +c;
    //}
    //
    //private static int sum(int a, int b) {
    //    return a + b;
    //}
}
