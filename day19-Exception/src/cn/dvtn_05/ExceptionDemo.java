package cn.dvtn_05;

/**
 *
 * throw:
 * 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出。
 * 注意这个时候抛出的应该是异常的对象。
 *
 *
 * throws和throw的区别（面试）
 *  	throws:
 *  		1）用在方法声明后面，跟的是异常类名
 *  		2）可以跟多个异常类名，用逗号隔开
 *  		3）表示抛出异常，由该方法的调用者来处理
 *  		4）throws表示出现异常的一种可能性，并不一定会发生这些异常
 *  	throw:
 *  		1）用在方法体内，跟的是异常对象名
 *  		2）只能抛出一个异常对象名
 *  		3）表示抛出异常，由方法体内的语句处理
 *  		4）throw则是抛出了异常，执行throw则一定抛出了某种异常
 *
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        method();

        try {
            method2();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void method() {
        int a = 10;
        int b = 0;
        if(b==0) {
            throw new ArithmeticException();
        }else {
            System.out.println(a/b);
        }
    }
    public static void method2() throws Exception {
        int a = 10;
        int b = 0;
        if(b==0) {
            throw new Exception();
        }else {
            System.out.println(a/b);
        }
    }
}