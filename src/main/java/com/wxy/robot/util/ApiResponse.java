package com.wxy.robot.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午6:05
 * @Description TODO
 **/
@Data
@AllArgsConstructor
public class ApiResponse {
    private Integer code;
    private String msg;
    private Object data;
}
