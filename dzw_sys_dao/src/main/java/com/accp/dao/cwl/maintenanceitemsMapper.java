package com.accp.dao.cwl;

import com.accp.pojo.cwl.maintenanceitems;

public interface maintenanceitemsMapper {
    int deleteByPrimaryKey(String oid);

    int insert(maintenanceitems record);

    int insertSelective(maintenanceitems record);

    maintenanceitems selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(maintenanceitems record);

    int updateByPrimaryKey(maintenanceitems record);
}