package com.accp.dao.cyj;

import com.accp.pojo.cyj.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}