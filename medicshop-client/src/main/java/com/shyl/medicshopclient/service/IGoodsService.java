package com.shyl.medicshopclient.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shyl.medicshopclient.entity.Goods;

import java.util.List;
import java.util.Map;

public interface IGoodsService {

    Page<Goods> selectPage(Page<Goods> page);

    Page<Goods> selectPage1(Page<Goods> page);

    void update(String name, String code);
}
