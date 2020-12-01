package com.accp.dao.cyj;

import com.accp.pojo.cyj.Perm;

public interface PermMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Perm record);

    int insertSelective(Perm record);

    Perm selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Perm record);

    int updateByPrimaryKey(Perm record);
}