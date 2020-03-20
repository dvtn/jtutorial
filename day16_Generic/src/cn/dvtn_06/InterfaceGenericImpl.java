package cn.dvtn_06;

/**
 * 实现类在实现接口的时候
 * 1.已经知道是什么类型
 * 2.还不知道是什么类型
 */

//public class InterfaceGenericImpl implements InterfaceGeneric<String> {
//
//    @Override
//    public void show(String s) {
//        System.out.println(s);
//    }
//}

public class InterfaceGenericImpl<T> implements InterfaceGeneric<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
