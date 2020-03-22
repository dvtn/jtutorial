package cn.dvtn.dao;

import cn.dvtn.pojo.User;

/**
 * 针对用户进行操作的接口
 * @author 独孤求败
 * @version v1.0
 */

public interface UserDao {
    /**
     * 判断登录是否成功
     * @param username
     * @param password
     * @return 返回登录是否成功
     */
    boolean isLogin(String username, String password);

    /**
     * 注册功能
     * @param user 要注册用户信息
     */
    void register(User user);
}
