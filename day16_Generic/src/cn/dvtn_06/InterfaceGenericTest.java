package cn.dvtn_06;

public class InterfaceGenericTest {
    public static void main(String[] args) {
        ////第一种情况测试
        //InterfaceGeneric<String> ig = new InterfaceGenericImpl();
        //ig.show("独孤求败");

        //第二种情况测试
        InterfaceGeneric<String> igs = new InterfaceGenericImpl<String>();
        igs.show("东方不败");

        InterfaceGeneric<Integer> igi = new InterfaceGenericImpl<Integer>();
        igi.show(1000);

    }
}
