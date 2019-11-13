package com.wxy.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午4:47
 * @Description TODO
 **/
@Data
@Entity
@Table(name = "t_user")
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "id", columnDefinition = "bigint(20) auto_increment comment '主键ID(自增)'")
    private Long id;

    @Column(name = "username", unique = true, nullable = false, columnDefinition = "varchar(64) comment '用户名'")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(64) comment '密码'")
    private String password;

    @Column(name = "email", unique = true, nullable = false, columnDefinition = "varchar(64) comment '邮箱'")
    private String email;

    @Column(name = "salt", nullable = false, columnDefinition = "varchar(10) comment '盐值'")
    private String salt;
}
