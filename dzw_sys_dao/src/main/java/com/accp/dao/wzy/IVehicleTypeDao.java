package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.VehicleType;

public interface IVehicleTypeDao {
	// 查询所有车辆型号
	List<VehicleType> queryAll();

	// 查询所有车辆型号
	List<VehicleType> queryVehicleTypeById(@Param("vbrandid")Integer vbrandid);
	
	// 根据车型编码/车型名称查询车辆
	List<VehicleType> queryVehicleType(@Param("parameter2") String parameter2);

	// 新增车型品牌
	int addVehicleType(@Param("vehicletype") VehicleType vehicletype);

	// 根据编码删除品牌
	int delVehicleType(@Param("vtypeid") Integer vtypeid);

	// 修改车型品牌
	int updateVehicleType(@Param("vehicletype") VehicleType vehicletype);
}
