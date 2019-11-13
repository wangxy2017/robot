package com.wxy.robot.mapper;

import com.wxy.robot.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Table;
import java.util.List;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午5:12
 * @Description TODO
 **/
@Slf4j
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testInsert() {
        User user = new User(null, "123", "123", "123@qq.com", "123");
        int save = userMapper.saveUser(user);
        log.info("新增：user = {}", save);
        List<User> list = userMapper.queryAll();
        log.info("查询：list = {}", list);
    }
}
