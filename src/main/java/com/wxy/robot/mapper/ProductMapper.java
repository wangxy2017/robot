package com.wxy.robot.mapper;

import com.wxy.robot.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    @Insert({"insert into t_product(icon,name,url) values(#{icon},#{name},#{url})"})
    int saveProduct(Product product);


    @Select({"select * from t_product"})
    List<Product> findAll();
}
