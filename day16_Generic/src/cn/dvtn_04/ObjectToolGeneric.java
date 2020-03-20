package cn.dvtn_04;

/**
 * 泛型类,泛型定义在类上，格式：
 */

public class ObjectToolGeneric<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
