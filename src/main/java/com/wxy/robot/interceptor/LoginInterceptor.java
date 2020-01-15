package com.wxy.robot.interceptor;

import com.wxy.robot.core.ApiResponse;
import com.wxy.robot.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author sir
 * @Date 2020/1/15 17:24
 * @Description TODO
 **/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return true;
        }
        throw new RuntimeException("未登录");
    }
}
