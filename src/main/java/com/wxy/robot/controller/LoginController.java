package com.wxy.robot.controller;

import com.wxy.robot.entity.User;
import com.wxy.robot.service.UserService;
import com.wxy.robot.util.ApiResponse;
import com.wxy.robot.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping
    public ApiResponse login(String username, String password) {
        User user = userService.queryByUsername(username);
        if (user != null && user.getPassword().equals(MD5Utils.encrypt(password, user.getSalt()))) {
            return new ApiResponse(1, "登录成功", null);
        }
        return new ApiResponse(-1, "用户名或密码错误", null);
    }
}
