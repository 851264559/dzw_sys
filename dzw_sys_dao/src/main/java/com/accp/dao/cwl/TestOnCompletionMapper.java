package com.accp.dao.cwl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.TestOnCompletion;

public interface TestOnCompletionMapper {
    int deleteByPrimaryKey(String repairorder);

    int insert(TestOnCompletion record);

    int insertSelective(TestOnCompletion record);

    TestOnCompletion selectByPrimaryKey(String repairorder);

    int updateByPrimaryKeySelective(TestOnCompletion record);

    int updateByPrimaryKey(TestOnCompletion record);
    
    //@Select("SELECT * FROM testoncompletion")
    public List<TestOnCompletion> queryInfosByCondition(@Param("sTime") String startTime,@Param("eTime") String endTime,
    		@Param("rOrder") String repairOrder,@Param("tDState") String theDocumentsState,@Param("lPNumber") String licensePlateNumber,
    		@Param("vin") String VIN);
}