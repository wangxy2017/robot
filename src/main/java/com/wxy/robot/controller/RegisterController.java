package com.wxy.robot.controller;

import com.wxy.robot.service.UserService;
import com.wxy.robot.core.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午6:03
 * @Description TODO
 **/
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param username
     * @param password
     * @param email
     * @return
     */
    @PostMapping
    public ApiResponse register(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        boolean b = userService.saveUser(username, password, email);
        if (b) {
            return new ApiResponse(1, "注册成功", null);
        }
        return new ApiResponse(-1, "注册失败", null);
    }
}
