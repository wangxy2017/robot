package com.wxy.robot.mapper;

import com.wxy.robot.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-13 下午5:06
 * @Description TODO
 **/
@Repository
public interface UserMapper {

    @Insert({"insert into t_user(username,password,email,salt) values(#{username},#{password},#{email},#{salt})"})
    int saveUser(User user);

    @Select({"select * from t_user where username = #{username}"})
    User queryByUsername(String username);

    @Select({"select * from t_user"})
    List<User> findAll();
}
