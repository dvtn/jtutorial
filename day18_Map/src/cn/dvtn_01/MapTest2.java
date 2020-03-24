package cn.dvtn_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 4.获取功能
 *  V get(Object key):根据键获取值
 *  Set<K> keySet(): 获取集合中所有的键值对
 *  Collection<V> values():获取集合中所有的值的集合
 */
public class MapTest2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String,String>();

        //添加元素
        map.put("邓超","孙俪");
        map.put("张国立","邓婕");
        map.put("周杰伦","昆凌");
        map.put("张杰","谢娜");

        // V get(Object key):根据键获取值
        //get:邓婕
        //get:null
        System.out.println("get:"+map.get("张国立"));

        Set<String> set = map.keySet();
        for(String s: set){
            System.out.println(s);
        }

        Collection<String> collection = map.values();
        for(String val: collection){
            System.out.println(val);
        }
    }
}
