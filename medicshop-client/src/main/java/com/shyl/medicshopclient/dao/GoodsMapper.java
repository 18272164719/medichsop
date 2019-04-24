package com.shyl.medicshopclient.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shyl.medicshopclient.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface GoodsMapper extends BaseMapper<Goods> {

    @Select("select * from b_goods")
    List<Goods> selectPage(@Param("page") Pagination page);

    @Update("update")
    void update(@Param("name")String name, @Param("code")String code);
}
