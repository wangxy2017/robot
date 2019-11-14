package com.wxy.robot.entity;

import com.wxy.robot.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_product")
@AllArgsConstructor
public class Product extends BaseEntity {

    @Column(name = "icon", nullable = false, columnDefinition = "varchar(100) comment '图标路径'")
    private String icon;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(20) comment '产品名称'")
    private String name;

    @Column(name = "url", nullable = false, columnDefinition = "varchar(64) comment '接口路径'")
    private String url;
}
