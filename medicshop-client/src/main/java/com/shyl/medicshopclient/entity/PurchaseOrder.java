package com.shyl.medicshopclient.entity;

import lombok.Data;

@Data
public class PurchaseOrder {

    private String storeCode;

    private String deptCode;

    private String vendorCode;

    private String withGoodsCode;

    private String orderDate;

}
