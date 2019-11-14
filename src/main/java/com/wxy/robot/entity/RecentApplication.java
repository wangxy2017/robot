package com.wxy.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-14 上午10:45
 * @Description TODO
 **/
@Data
@Entity
@Table(name = "t_recent_application")
@AllArgsConstructor
public class RecentApplication {

    @Id
    @Column(name = "id", columnDefinition = "bigint(20) auto_increment comment '主键ID(自增)'")
    private Long id;

    @Column(name = "user_id", nullable = false, columnDefinition = "bigint(20) comment '用户ID'")
    private Long userId;

    @Column(name = "application_id", nullable = false, columnDefinition = "bigint(20) comment '应用ID'")
    private Long applicationId;
}
