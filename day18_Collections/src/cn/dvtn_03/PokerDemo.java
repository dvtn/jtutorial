package cn.dvtn_03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主洗牌和发牌
 *
 * 分析：
 * 		1. 创建一个牌盒
 * 		2. 装牌
 * 		3. 洗牌
 * 		4. 发牌
 * 		5. 看牌
 */

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<String>();

        //装牌
        //黑桃A, 黑桃2，..., 黑桃K
        //红桃A, 红桃2, ..., 红桃K
        //梅花A，梅花2, ..., 梅花K
        //方块A,...
        //定义一个花色数组
        String[] colors = {"♠","♣","♡","♢"};

        //定义一个点数数组
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(String color: colors) {
            for(String number: numbers) {
                array.add(color.concat(number));
            }
        }

        array.add("小王");
        array.add("大王");

        System.out.println("扑克牌:"+array);

        //洗牌
        Collections.shuffle(array);
        System.out.println("洗扑克牌:"+array);


        //发牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();

        ArrayList<String> diPai = new ArrayList<String>();

        //发牌
        for(int x=0; x<array.size(); x++) {
            if(x>=array.size()-3) {
                diPai.add(array.get(x));
            } else if(x%3==0) {
                player1.add(array.get(x));
            } else if (x%3==1) {
                player2.add(array.get(x));
            } else if (x%3==2) {
                player3.add(array.get(x));
            }
        }


        //看牌
        checkPoker("玩家1", player1);
        checkPoker("玩家2", player2);
        checkPoker("玩家3", player3);

        checkPoker("底牌", diPai);


    }
    //看牌
    public static void checkPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for(String s: array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
