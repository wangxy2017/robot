package com.wxy.robot.core;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "id", columnDefinition = "bigint(20) auto_increment comment '主键ID(自增)'")
    private Long id;
}
