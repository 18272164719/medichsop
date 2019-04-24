package com.shyl.medicshopclient.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UploadGoodsTask {

    //表示每次查询100条
    private static final int SEND_COUNT = 100;


    public void send (){
        //1、从数据库中查询出要上传的商品


        //2、开始上传


        //3、更新已经上传商品的状态

    }

}
