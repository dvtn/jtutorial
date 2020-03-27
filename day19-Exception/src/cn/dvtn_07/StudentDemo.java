package cn.dvtn_07;

import java.util.Scanner;

/**
 * 自定义异常测试类
 */
public class StudentDemo {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = sc.nextInt();
        Teacher t = new Teacher();
        t.check(score);
    }
}
