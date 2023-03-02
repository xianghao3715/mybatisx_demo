package com.atguigu.mybatisx;

import com.atguigu.mybatisx.mapper.ProductMapper;
import com.atguigu.mybatisx.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisxDemoApplicationTests {
    @Resource
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
        List<Product> products = productMapper.selectList(null);
        products.forEach(System.out::println);

    }



}
