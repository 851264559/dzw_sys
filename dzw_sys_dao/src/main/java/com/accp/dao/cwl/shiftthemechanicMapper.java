package com.accp.dao.cwl;

import com.accp.pojo.cwl.shiftthemechanic;

public interface shiftthemechanicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(shiftthemechanic record);

    int insertSelective(shiftthemechanic record);

    shiftthemechanic selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(shiftthemechanic record);

    int updateByPrimaryKey(shiftthemechanic record);
}