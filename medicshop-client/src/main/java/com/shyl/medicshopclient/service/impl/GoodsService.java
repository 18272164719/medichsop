package com.shyl.medicshopclient.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shyl.medicshopclient.aop.Ds;
import com.shyl.medicshopclient.config.DBContextHolder;
import com.shyl.medicshopclient.config.DBTypeEnum;
import com.shyl.medicshopclient.dao.GoodsMapper;
import com.shyl.medicshopclient.entity.Goods;
import com.shyl.medicshopclient.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class GoodsService extends ServiceImpl<GoodsMapper,Goods> implements IGoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    @Ds(DBTypeEnum.db1)
    public Page<Goods> selectPage(Page<Goods> page) {
        EntityWrapper<Goods> goodsEntityWrapper = new EntityWrapper<>();
        goodsEntityWrapper.eq("","");
        goodsMapper.selectList(goodsEntityWrapper);

        System.out.println("当前数据库是"+DBContextHolder.getDbType());
        return page.setRecords(goodsMapper.selectPage(page));
    }

    @Override
    @Ds(DBTypeEnum.db2)
    public Page<Goods> selectPage1(Page<Goods> page) {
        System.out.println("当前数据库是"+DBContextHolder.getDbType());
        return page.setRecords(goodsMapper.selectPage(page));
    }


    @Override
    @Ds(DBTypeEnum.db1)
    @Transactional
    public void update(String name, String code) {
        goodsMapper.update(name,code);
    }
}
