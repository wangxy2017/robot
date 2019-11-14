package com.wxy.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-14 上午10:41
 * @Description TODO
 **/
@Data
@Entity
@Table(name = "t_application")
@AllArgsConstructor
public class Application {

    @Id
    @Column(name = "id", columnDefinition = "bigint(20) auto_increment comment '主键ID(自增)'")
    private Long id;

    @Column(name = "icon", unique = true, nullable = false, columnDefinition = "varchar(500) comment '图标路径'")
    private String icon;

    @Column(name = "name", unique = true, nullable = false, columnDefinition = "varchar(20) comment '应用名称'")
    private String name;

    @Column(name = "href", unique = true, nullable = false, columnDefinition = "varchar(500) comment '跳转地址'")
    private String href;
}
