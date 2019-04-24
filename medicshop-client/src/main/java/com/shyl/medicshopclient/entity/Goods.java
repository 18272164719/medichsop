package com.shyl.medicshopclient.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("b_goods")
public class Goods{

    private String code;

    private String name;

    @TableField("genericName")
    private String genericName;

    private String pinyin;

    private String unit;

    private String model;
    @TableField("dosageFormName")
    private String dosageFormName;
    @TableField("packDesc")
    private String packDesc;
    @TableField("producerName")
    private String producerName;

    private String original;
    @TableField("authorizeNo")
    private String authorizeNo;
    @TableField("standardCode")
    private String standardCode;

    private String barcode;
    @TableField("storageType")
    private String storageType;
}
