package cn.dvtn_07;
/**
 *
 * Java不可能对所有的情况考虑到，所以，在实际开发中，我们可能需要自己定义异常。
 * 而我们自己随意写一个类，是不能作为异常类来看。要想你的类是一个异常类，必须继承自Exception或者RuntimeException类。
 *
 * 两种方式：
 * 1) 继承Exception
 * 2) 继承RuntimeException
 *
 */
public class MyException extends Exception{
    public MyException(){

    }
    public MyException(String message){
        super(message);
    }
}
