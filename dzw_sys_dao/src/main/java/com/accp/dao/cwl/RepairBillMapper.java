package com.accp.dao.cwl;

import com.accp.pojo.cwl.RepairBill;

public interface RepairBillMapper {
    int deleteByPrimaryKey(String roddnumber);

    int insert(RepairBill record);

    int insertSelective(RepairBill record);

    RepairBill selectByPrimaryKey(String roddnumber);

    int updateByPrimaryKeySelective(RepairBill record);

    int updateByPrimaryKey(RepairBill record);
}