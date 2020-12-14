package com.accp.dao.wzy;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.SmallRepair;

public interface ISmallRepairDao {
	int addSmallRepair(@Param("smallrepair")SmallRepair smallrepair);
}
