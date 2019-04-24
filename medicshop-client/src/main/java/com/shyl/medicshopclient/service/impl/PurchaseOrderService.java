package com.shyl.medicshopclient.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shyl.medicshopclient.dao.PurchaseOrderMapper;
import com.shyl.medicshopclient.entity.PurchaseOrder;
import com.shyl.medicshopclient.service.IPurchaseOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class PurchaseOrderService extends ServiceImpl<PurchaseOrderMapper,PurchaseOrder> implements IPurchaseOrderService{


    @Override
    public List<Map<String, Object>> selectPage() {
        return null;
    }

    @Override
    @Transactional
    public void update(String flag) {

    }
}
