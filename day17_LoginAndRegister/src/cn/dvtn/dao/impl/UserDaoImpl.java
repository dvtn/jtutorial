package cn.dvtn.dao.impl;

import cn.dvtn.dao.UserDao;
import cn.dvtn.pojo.User;

import java.util.ArrayList;

/**
 * 用户操作的具体实现类(集合版)
 * @author 独孤求败
 * @version v1.0
 */

public class UserDaoImpl implements UserDao {

    //为了多个方法可以使用同一个集合,并且多个对象使用同一个集合
    private static ArrayList<User> list = new ArrayList<User>();
    @Override
    public boolean isLogin(String username, String password) {
        //遍历集合，获取用户，并判断该用户名和密码和传递过来的匹配
        boolean flag = false;
        for(User user: list){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
            }
        }

        return flag;
    }

    @Override
    public void register(User user) {
        //把用户信息存入集合
        list.add(user);
    }
}
