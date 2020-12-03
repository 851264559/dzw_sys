package com.accp.dao.cwl;

import com.accp.pojo.cwl.closeanaccount;

public interface closeanaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(closeanaccount record);

    int insertSelective(closeanaccount record);

    closeanaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(closeanaccount record);

    int updateByPrimaryKey(closeanaccount record);
}