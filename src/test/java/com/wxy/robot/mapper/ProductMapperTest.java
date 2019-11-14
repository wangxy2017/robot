package com.wxy.robot.mapper;

import com.wxy.robot.entity.Product;
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
public class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    @BeforeEach
    public void insertProduct() {
        Product product = new Product("123", "123", "123");
        int save = productMapper.saveProduct(product);
        log.info("新增：product = {}", save);
    }

    @Test
    public void testFindAll() {
        List<Product> list = productMapper.findAll();
        log.info("查询：list = {}", list);
    }

}
