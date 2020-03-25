package cn.dvtn_03;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap: 是基于哈希表的Map接口实现
 * 哈希表的作用是用来保证键的唯一性
 *
 * HashMap<String, String>
 *
 */

public class HashMapTest {
    public static void main(String[] args) {
        //创建集合类
        HashMap<String, String> hm = new HashMap<String, String>();

        //创建并添加元素
        hm.put("it00001", "马云");
        hm.put("it00003", "马化腾");
        hm.put("it00004", "乔布斯");
        hm.put("it00005", "张朝阳");
        hm.put("it00002", "雷军");
        hm.put("it00001", "比尔盖茨");

        //遍历集合
        Set<String> set = hm.keySet();
        for(String key: set){
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }

    }

}
