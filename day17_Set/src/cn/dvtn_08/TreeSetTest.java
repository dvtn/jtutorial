package cn.dvtn_08;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 键盘录入5个学生信息（姓名，语文成绩，数学成绩，英文成绩),按照总分由高到低排序输出到控制台
 *
 * 分析：
 *  1.定义学生类
 *  2.创建一个TreeSet集合
 *  3.键盘录入5个学生信息
 *  4.遍历TreeSet集合
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //总分由高到低
                int num=o2.getSum()-o1.getSum();
                //总分相同的不一定语文相同
                int num2= num==0?o1.getChinese()-o2.getChinese():num;
                int num3= num2==0?o1.getMath()-o2.getMath():num2;
                int num4 = num3==0?o1.getEnglish()-o2.getEnglish():num3;
                int num5= num4==0?o1.getName().compareTo(o2.getName()):num4;
                return num5;
            }
        });

        System.out.println("学生信息录入开始");
        for (int i = 1; i <=5 ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+i+"个学生的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第"+i+"个学生的语文成绩:");
            String chinese = sc.nextLine();
            System.out.println("请输入第"+i+"个学生的数据成绩:");
            String math = sc.nextLine();
            System.out.println("请输入第"+i+"个学生的英语成绩:");
            String english = sc.nextLine();

            //把数据封装到学生对象中
            Student s = new Student();
            s.setName(name);
            s.setChinese(Integer.parseInt(chinese));
            s.setMath(Integer.parseInt(math));
            s.setEnglish(Integer.parseInt(english));

            //添加到TreeSet集合
            ts.add(s);

        }

        System.out.println("学生信息录入完毕");
        System.out.println("学生信息从高到低排序如下：");
        System.out.println("姓名\t\t语文成绩\t\t数学成绩\t\t英文成绩\t\t总分");
        for(Student s:ts){
            System.out.println(s.getName()+"\t\t"+s.getChinese()+"\t\t"+s.getMath()+"\t\t"+s.getEnglish()+"\t\t"+s.getSum());
        }

    }
}
