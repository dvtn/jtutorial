package cn.dvtn_02;

/**
 * Map集合遍历方式二
 * Set<Map.Entry<K, V>> entrySet():
 * 思路：
 * 1.获取所有键值对对象的集合
 * 2.遍历键值对对象的集合，得到每一个键值对对象
 * 3.根据键值对对象获取键和值
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String,String>();

        //添加元素
        map.put("邓超","孙俪");
        map.put("张国立","邓婕");
        map.put("周杰伦","昆凌");
        map.put("张杰","谢娜");

        //遍历
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> me: entrySet){
            String key = me.getKey();
            String value = me.getValue();

            System.out.println("key:"+key+"---"+"value:"+value);
        }


    }
}
