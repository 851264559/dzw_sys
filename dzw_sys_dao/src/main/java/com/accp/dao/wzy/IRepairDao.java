package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.Repair;

public interface IRepairDao {

	int delRepair(@Param("rid")Integer rid);
	
	int updateRepair(@Param("repair")Repair repair);
	
	int addRepair(@Param("repair")Repair repair);
	
	//查询所有维修项目
	List<Repair> queryAll();
	
	Repair queryRepairByRid(@Param("rid")Integer rid);
	
	List<Repair> queryRepairByXtype(@Param("xtype")Integer xtype);
}
