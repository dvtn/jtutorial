package cn.dvtn_01;

import java.util.ArrayList;

/**
 * 集合的嵌套遍历
 *
 * 需求：班级有学生，每个学生是一个对象，可以用一个集合表示一个班级的学生。
 * 但是，旁边班级，每个班级也组成成一个集合。
 */

public class ArrayListTest {
    public static void main(String[] args) {

        //创建大集合
        ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();
        //创建大集合中的第一个集合
        ArrayList<Student> xy = new ArrayList<Student>();
        Student xy1 = new Student("唐僧",30);
        Student xy2 = new Student("孙悟空",28);
        Student xy3 = new Student("猪八戒",26);
        Student xy4 = new Student("沙僧",24);
        Student xy5 = new Student("白龙马",22);

        xy.add(xy1);
        xy.add(xy2);
        xy.add(xy3);
        xy.add(xy4);
        xy.add(xy5);
        //添加到大集合
        bigArrayList.add(xy);


        //创建大集合中的第二个集合
        ArrayList<Student> sg = new ArrayList<Student>();
        Student sg1 = new Student("诸葛亮",29);
        Student sg2 = new Student("郭嘉",27);
        Student sg3 = new Student("司马懿",25);
        Student sg4 = new Student("荀彧",23);
        Student sg5 = new Student("庞统",21);

        sg.add(sg1);
        sg.add(sg2);
        sg.add(sg3);
        sg.add(sg4);
        sg.add(sg5);
        //添加到大集合
        bigArrayList.add(sg);


        //创建大集合中的第三个集合
        ArrayList<Student> sh = new ArrayList<Student>();
        Student sh1 = new Student("宋江",44);
        Student sh2 = new Student("吴用",43);
        Student sh3 = new Student("卢俊义",47);
        Student sh4 = new Student("鲁智深",41);
        Student sh5 = new Student("武松",36);

        sh.add(sh1);
        sh.add(sh2);
        sh.add(sh3);
        sh.add(sh4);
        sh.add(sh5);
        //添加到大集合
        bigArrayList.add(sh);

        //遍历
        for(ArrayList<Student> list: bigArrayList){
            for(Student s: list){
                System.out.println(s.getName()+"---"+s.getAge());
            }
        }

    }
}
