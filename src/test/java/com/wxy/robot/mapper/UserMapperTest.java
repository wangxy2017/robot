package com.wxy.robot.mapper;

import com.wxy.robot.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

    @BeforeEach
    public void insert() {
        User user = new User("123", "123", "123@qq.com", "123");
        int save = userMapper.saveUser(user);
        log.info("新增：user = {}", save);
    }

    @Test
    public void testFindAll() {
        List<User> list = userMapper.findAll();
        log.info("查询：list = {}", list);
    }

    @Test
    public void testQueryByUsername() {
        String username = "123";
        User user = userMapper.queryByUsername(username);
        log.info("查询：user = {}", user);
    }
}
