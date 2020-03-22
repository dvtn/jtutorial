package cn.dvtn.test;

import cn.dvtn.dao.UserDao;
import cn.dvtn.dao.impl.UserDaoImpl;
import cn.dvtn.pojo.User;

import java.util.Scanner;

/**
 * 用户测试类
 * @author 独孤求败
 * @version v1.0
 */
public class UserTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------欢迎光临--------------");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            UserDao ud = new UserDaoImpl();
            switch (choice) {
                case "1":
                    //登录界面，请输入用户名和密码
                    System.out.println("--------------欢迎光临--------------");
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();

                    //调用登录功能
                    //UserDao ud = new UserDaoImpl();
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登录成功");
                        System.exit(0);
                    } else {
                        System.out.println("用户名或者密码有误，登录失败");
                    }
                    break;

                case "2":
                    //欢迎界面，请输入用户名和密码
                    System.out.println("--------------欢迎光临--------------");
                    System.out.println("请输入用户名：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = sc.nextLine();
                    //把用户封装到对象中
                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    //调用注册功能
                    //UserDao ud = new UserDaoImpl();
                    ud.register(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                default:
                    System.out.println("谢谢使用，欢迎下次再来");
                    System.exit(0);
                    break;

            }
        }
    }
}
