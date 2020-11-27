package com.accp.dao.cwl;

import com.accp.pojo.cwl.BillingInfo;

public interface BillingInfoMapper {
    int insert(BillingInfo record);

    int insertSelective(BillingInfo record);
}