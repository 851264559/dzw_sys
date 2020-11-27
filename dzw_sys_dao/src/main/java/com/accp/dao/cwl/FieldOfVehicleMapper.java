package com.accp.dao.cwl;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.FieldOfVehicle;

public interface FieldOfVehicleMapper {
    int deleteByPrimaryKey(String carnumber);

    int insert(FieldOfVehicle record);

    int insertSelective(FieldOfVehicle record);

    FieldOfVehicle selectByPrimaryKey(String carnumber);

    int updateByPrimaryKeySelective(FieldOfVehicle record);

    int updateByPrimaryKey(FieldOfVehicle record);
    
    @Select("SELECT * FROM FieldOfVehicle")
    public List<FieldOfVehicle> queryFieldOfVehicle();
}