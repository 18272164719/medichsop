package com.shyl.medicshopclient.entity;

import lombok.Data;

@Data
public class PurchaseOrderDetail {

    private PurchaseOrder purchaseOrder;

    private String goodsCode;

    private String batchCode;

    private String batchDate;

    private String valiMonth;

    private String qty;

    private String delveryPrice;

    private String purchasePrice;

    private String delveryPriceRate;

    private String purchasePriceRate;
}
