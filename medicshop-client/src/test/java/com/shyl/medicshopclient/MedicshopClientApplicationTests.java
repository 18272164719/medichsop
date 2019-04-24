package com.shyl.medicshopclient;

import com.baomidou.mybatisplus.plugins.Page;
import com.shyl.medicshopclient.entity.Goods;
import com.shyl.medicshopclient.service.IGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicshopClientApplicationTests {

	@Resource
	private IGoodsService goodsService;

	@Test
	public void contextLoads() {
		/*Page page=new Page(1,10);
		Page<Goods> goodsPage = goodsService.selectPage(page);
		for(Goods g : goodsPage.getRecords()){
			System.out.println(g.getCode());
		}
		System.out.println("1"+goodsPage.getSize());


		goodsPage = goodsService.selectPage1(page);
		for(Goods g : goodsPage.getRecords()){
			System.out.println(g.getCode());
		}
		System.out.println("2"+goodsPage.getSize());*/

		goodsService.update("ceshi","1");

	}

}
