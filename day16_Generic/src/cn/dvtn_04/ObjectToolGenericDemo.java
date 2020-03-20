package cn.dvtn_04;

/**
 * 早些时候，我们使用Object来代表任意类型。
 * 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题。
 * 也就是说这样的程序并不是安全的，所以java在jdk5后引入了泛型，来解决这个问题。
 */

public class ObjectToolGenericDemo {
    public static void main(String[] args) {
       //ObjectTool ot = new ObjectTool();
       //ot.setObj(new String("独孤求败"));
       //String s = (String)ot.getObj();
       //System.out.println("名字是："+ s);
       //
       //ot.setObj(new Integer(30));
       //Integer age = (Integer) ot.getObj();
       //System.out.println("年龄是："+age);
       //
       //ot.setObj(new String("风清扬"));
       ////java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
       //Integer i = (Integer) ot.getObj();
       // System.out.println("i:"+i);

        ObjectToolGeneric<String> ot = new ObjectToolGeneric<String>();
        //ot.setObj(new Integer(27)); //编译的时候已经报错
        ot.setObj(new String("杨过"));
        String s = ot.getObj();
        System.out.println("大名是："+ s);

        ObjectToolGeneric<Integer> ot2 = new ObjectToolGeneric<Integer>();
        ot2.setObj(new Integer(30));
        Integer age2 = ot2.getObj();
        System.out.println("age2:"+age2);


    }
}
