package com.shyl.medicshopclient.task;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.shyl.medicshopclient.entity.Goods;
import com.shyl.medicshopclient.service.IGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private IGoodsService goodsService;


    @GetMapping("/goods1")
    @ResponseBody
    public Page<Goods> getGoods() {


        Page page = new Page(1, 10);
        return goodsService.selectPage(page);
    }


    @PostMapping("/goods2")
    @ResponseBody
    public Page<Goods> selectGoods() {
        Page page = new Page(1, 10);
        return goodsService.selectPage1(page);
    }
}
