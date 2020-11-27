package com.accp.dao.ct;

import com.accp.pojo.ct.Vehicle;

public interface VehicleMapper {
    int deleteByPrimaryKey(String vid);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    Vehicle selectByPrimaryKey(String vid);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);
}