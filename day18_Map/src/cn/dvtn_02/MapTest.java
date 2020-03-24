package cn.dvtn_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集全遍历
 * 1.获取键的集合，遍历键集合，根据键找值
 *
 */

public class MapTest {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String,String>();

        //添加元素
        map.put("邓超","孙俪");
        map.put("张国立","邓婕");
        map.put("周杰伦","昆凌");
        map.put("张杰","谢娜");

        //遍历
        Set<String> set = map.keySet();
        for(String key: set){
            String value = map.get(key);
            System.out.println("key:"+key+"---"+"value:"+value);
        }
    }
}
