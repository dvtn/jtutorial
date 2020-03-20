package cn.dvtn_03;

/**
 * 早些时候，我们使用Object来代表任意类型。
 * 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题。
 * 也就是说这样的程序并不是安全的，所以java在jdk5后引入了泛型，来解决这个问题。
 */

public class ObjectToolDemo {
    public static void main(String[] args) {
        ObjectTool ot = new ObjectTool();

        //正常使用没有问题
        ot.setObj(new Integer(60));
        Integer age = (Integer)ot.getObj();
        System.out.println("年龄是："+age);

        ot.setObj(new String("独孤求败"));
        String name = (String) ot.getObj();
        System.out.println("姓名是："+ name);

        System.out.println("------------我是分隔线-----------------");
        ot.setObj(new Integer(30));
        //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        String ss = (String) ot.getObj();
        System.out.println("姓名："+ ss);


    }
}
