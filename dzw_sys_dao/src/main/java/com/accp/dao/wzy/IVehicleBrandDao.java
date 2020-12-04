package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.VehicleBrand;

public interface IVehicleBrandDao {
	// 查询所有车型品牌
	List<VehicleBrand> queryAll();

	// 根据编码/名称/首字母查询品牌
	List<VehicleBrand> queryVehicleBrand(@Param("parameter1") String parameter1);

	// 新增车型品牌
	int addVehicleBrand(@Param("vehiclebrand") VehicleBrand vehiclebrand);

	// 根据编码删除品牌
	int delVehicleBrand(@Param("vbrandid") Integer vbrandid);

	// 修改车型品牌
	int updateVehicleBrand(@Param("vehiclebrand") VehicleBrand vehiclebrand);
}
