package com.atguigu.mybatisx.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatisx.pojo.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Mapper
* @createDate 2023-02-28 19:45:13
* @Entity com.atguigu.mybatisx.pojo.Product
*/
@Repository
public interface ProductMapper extends BaseMapper<Product> {

}




