package cn.dvtn_02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型在哪些地方使用呢？
 *      看API, 如果类，接口，抽象类后跟有<E>就说明要使用泛型。一般来说就是在集合中使用。
 *
 * 需求： 用ArrayList存储字符元素，并遍历。用泛型改进代码。
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("独孤求败");
        array.add("风清扬");
        array.add("东方不败");
        array.add("任我行");

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("------------------------");
        //用for遍历
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
