package com.shyl.medicshopclient.service;

import java.util.List;
import java.util.Map;

public interface IPurchaseOrderService {

    List<Map<String, Object>> selectPage();

    void update(String flag);
}
