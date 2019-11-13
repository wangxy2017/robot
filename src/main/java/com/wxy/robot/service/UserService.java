package com.wxy.robot.service;

import com.wxy.robot.entity.User;
import com.wxy.robot.mapper.UserMapper;
import com.wxy.robot.util.CodeUtils;
import com.wxy.robot.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午5:54
 * @Description TODO
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * 新增用户
     *
     * @param username
     * @param password
     * @param email
     * @return
     */
    public boolean saveUser(String username, String password, String email) {
        Assert.hasText(username, "the parameter username is required");
        Assert.hasText(password, "the parameter password is required");
        Assert.hasText(email, "the parameter email is required");
        String salt = CodeUtils.randomStr(10);
        User user = new User(null, username, MD5Utils.encrypt(password, salt), email, salt);
        return userMapper.saveUser(user) > 0;
    }

    /**
     * 查询用户
     *
     * @param username
     * @return
     */
    public User queryByUsername(String username) {
        Assert.hasText(username, "the parameter username is required");
        return userMapper.queryByUsername(username);
    }
}
