package cn.dvtn_05;

//public class ObjectToolGeneric<T> {
//    //public void show(String s){
//    //    System.out.println(s);
//    //}
//    //
//    //public void show(Integer i ){
//    //    System.out.println(i);
//    //}
//    //
//    //public void show(Boolean b){
//    //    System.out.println(b);
//    //}
//
//    public void show(T t){
//        System.out.println(t);
//    }
//}


/**
 * 泛型方法：把泛型定义在方法上
 *
 */

public class ObjectToolGeneric{
    public <T> void show(T t){
        System.out.println(t);
    }
}