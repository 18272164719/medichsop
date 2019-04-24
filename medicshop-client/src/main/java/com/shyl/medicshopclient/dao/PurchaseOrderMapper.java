package com.shyl.medicshopclient.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shyl.medicshopclient.entity.PurchaseOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PurchaseOrderMapper extends BaseMapper<PurchaseOrder> {

    List<Map<String, Object>> selectPage(@Param("page") Pagination page);

    void update(String flag);
}
