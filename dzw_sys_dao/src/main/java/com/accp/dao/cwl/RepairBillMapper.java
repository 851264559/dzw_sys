package com.accp.dao.cwl;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.RepairBill;

public interface RepairBillMapper {
    int deleteByPrimaryKey(String roddnumber);

    int insert(RepairBill record);

    int insertSelective(RepairBill record);

    RepairBill selectByPrimaryKey(String roddnumber);

    int updateByPrimaryKeySelective(RepairBill record);

    int updateByPrimaryKey(RepairBill record);
    
    @Select("SELECT * FROM repairbill WHERE rOddNumber = #{rNum}")
    public RepairBill selectRepairBillInfosByRoddnumber(@Param("rNum") String roddnumber);
}