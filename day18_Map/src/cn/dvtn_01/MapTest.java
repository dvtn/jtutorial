package cn.dvtn_01;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合的功能概述
 *
 * 1.添加功能
 *  V put(K key, V value): 添加元素
 *
 * 2.删除功能
 *  void clear():移除所有的键值对
 *  V remove(Object key): 根据键删除键值对元素，并把值返回
 *
 * 3.判断功能
 *  boolean containsKey(Object key): 判断集合是否包含指定键
 *  boolean containsValue(Object value):判断集合是否包含指定值
 *  boolean isEmpty(): 判断集合是否为空
 *
 * 4.获取功能
 *  Set<Map.Entry<K, V>> entrySet():
 *  V get(Object key):根据键获取值
 *  Set<K> keySet(): 获取集合中所有的键值对
 *  Collection<V> values():获取集合中所有的值的集合
 *
 * 5.长度功能
 *  int size(): 集合长度。
 */

public class MapTest {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String,String>();

        //添加元素
        //V put(K key, V value): 添加元素
        //如果添加元素的键已存在，则返回之前键对应的值,否则返回null
        //System.out.println("put:"+map.put("文章","马伊俐"));
        //System.out.println("put:"+map.put("文章","姚笛"));
        map.put("邓超","孙俪");
        map.put("张国立","邓婕");
        map.put("周杰伦","昆凌");
        map.put("张杰","谢娜");

        //输出集合名称
        System.out.println("map:"+map);

        ////void clear():移除所有的键值对
        //map.clear();

        ////V remove(Object key): 根据键删除键值对元素，并把值返回
        //System.out.println("remove:"+map.remove("张国立"));

        ////boolean containsKey(Object key): 判断集合是否包含指定键
        //System.out.println("containsKey:"+map.containsKey("张杰"));
        //System.out.println("containsKey:"+map.containsKey("张军"));

        //boolean isEmpty(): 判断集合是否为空
        //System.out.println("isEmpty:"+map.isEmpty());

        System.out.println("size:"+map.size());
        //输出集合名称
        System.out.println("map:"+map);

    }
}
