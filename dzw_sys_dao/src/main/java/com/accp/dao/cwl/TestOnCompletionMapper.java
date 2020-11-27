package com.accp.dao.cwl;

import com.accp.pojo.cwl.TestOnCompletion;

public interface TestOnCompletionMapper {
    int deleteByPrimaryKey(String repairorder);

    int insert(TestOnCompletion record);

    int insertSelective(TestOnCompletion record);

    TestOnCompletion selectByPrimaryKey(String repairorder);

    int updateByPrimaryKeySelective(TestOnCompletion record);

    int updateByPrimaryKey(TestOnCompletion record);
}