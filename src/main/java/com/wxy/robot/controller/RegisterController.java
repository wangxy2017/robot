package com.wxy.robot.controller;

import com.wxy.robot.util.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午6:03
 * @Description TODO
 **/
@RestController
@RequestMapping("/register")
public class RegisterController {

    @PostMapping
    public ApiResponse register() {
        return null;
    }
}
