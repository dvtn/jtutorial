package cn.dvtn_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * 模拟斗地主洗牌和发牌并对牌进行排序
 *
 * 思路：
 * 		1.创建一个HashMap集合
 * 		2.创建一个ArrayList集合
 * 		3.创建花皱巴巴数组和点数数组
 * 		4.从0开始往HashMap里存储编号，存储对应的牌
 * 			同时往ArrayList里面存储编号即可。
 * 		5.洗牌（洗的是编号）
 * 		6.发牌（发的是编号，为了保证编号是排序的，就创建TreeSet集合接收）
 * 		7.看牌（遍历TreeSet集合，获取编号)
 *
 */

public class PokerDemo {
    public static void main(String[] args) {

        //1.创建一个HashMap集合
        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
        //2.创建一个ArrayList集合
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //3.创建花色数组和点数数组
        String[] colors = {"♠","♣","♡","♢"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //4.从0开始往HashMap里存储编号，并存储对应的牌，同时往ArrayList里面存储数据即可。
        int index = 0;

        for(String number:numbers) {
            for(String color:colors) {
                String poker = color.concat(number);
                hashMap.put(index, poker);
                arrayList.add(index);
                index++;
            }
        }

        hashMap.put(index, "小王");
        arrayList.add(index);
        index++;
        hashMap.put(index, "大王");
        arrayList.add(index);

        //洗牌
        Collections.shuffle(arrayList);

        //发牌
        TreeSet<Integer> treeSetPlayerI = new TreeSet<Integer>();
        TreeSet<Integer> treeSetPlayerII = new TreeSet<Integer>();
        TreeSet<Integer> treeSetPlayerIII = new TreeSet<Integer>();
        TreeSet<Integer> treeSetPocket = new TreeSet<Integer>();

        //发牌
        for(int x=0; x<arrayList.size(); x++) {
            if(x>=arrayList.size()-3) {
                treeSetPocket.add(arrayList.get(x));
            } else if(x%3==0) {
                treeSetPlayerI.add(arrayList.get(x));
            } else if (x%3==1) {
                treeSetPlayerII.add(arrayList.get(x));
            } else if (x%3==2) {
                treeSetPlayerIII.add(arrayList.get(x));
            }
        }



        //看牌
        showCard("玩家I", treeSetPlayerI, hashMap);
        showCard("玩家I", treeSetPlayerII, hashMap);
        showCard("玩家I", treeSetPlayerIII, hashMap);
        showCard("底牌", treeSetPocket, hashMap);



    }
    public static void showCard(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");
        for(Integer key: ts) {
            String value = hm.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
