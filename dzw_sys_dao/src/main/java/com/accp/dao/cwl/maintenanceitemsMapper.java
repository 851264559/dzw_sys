package com.accp.dao.cwl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.maintenanceitems;

public interface maintenanceitemsMapper {
    int deleteByPrimaryKey(String oid);

    int insert(maintenanceitems record);

    int insertSelective(maintenanceitems record);

    maintenanceitems selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(maintenanceitems record);

    int updateByPrimaryKey(maintenanceitems record);
    
    @Select("SELECT * FROM maintenanceitems WHERE workOrderNumber = #{wONum}")
    public List<maintenanceitems> queryMaintenanceitemsByWorkOrderNumber(@Param("wONum") String WorkOrderNumber);
    
    public List<maintenanceitems> queryMaintenanceitemsByCarNumber(@Param("cNum") String CarNumber);
}