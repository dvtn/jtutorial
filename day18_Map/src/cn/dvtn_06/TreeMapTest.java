package cn.dvtn_06;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 需求："aababcabcdabcde",获取字符串每一个字母出现的次数，要求结果a(5)b(4)c(3)d(2)e(1)格式
 * 分析：
 * 1.定义一个字符串（可以改进为键盘录入）
 * 2.定义一个TreeMap集合
 *   键：Character
 *   值：Integer
 * 3.把定符串转换为字符数组
 * 4.遍历字符数组，得到每一个字符
 * 5.拿刚才得到的字符作为键到集合中去找，看返回值
 *   是null:说明该键不存大，就把该字符作为键，1作为值存储
 *   不是null:说明该键存在，就把值加1，然后重写该键和值
 * 6.定义字符串缓冲区变量做拼接
 * 7.遍历集合，得到键和值，按照要求拼接
 * 8.把字符串缓冲区转换为字符串输出
 */
public class TreeMapTest {
    public static void main(String[] args) {
        //定义一个字符串（可以改进为键盘录入）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //定义一个TreeMap集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //把字符串转换为字符数组
        char[] chars = line.toCharArray();

        //遍历字符数组，得到每一个字符
        for(char ch: chars){
            //拿刚才得到的字符作为键到集合中去找，看返回值
            Integer i = tm.get(ch);
            //是null:说明该键不存大，就把该字符作为键，1作为值存储
            if(i==null){
                tm.put(ch, 1);
            } else {
                //不是null:说明该键存在，就把值加1，然后重写该键和值
                i++;
                tm.put(ch, i);
            }
        }

        //定义字符串缓冲区变量做拼接
        StringBuilder sb = new StringBuilder();

        //遍历集合，得到键和值，按照要求拼接
        Set<Character> set = tm.keySet();
        for(Character key: set){
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        //把字符串缓冲区转换为字符串输出
        String result = sb.toString();
        System.out.println("result:"+result);
    }
}
