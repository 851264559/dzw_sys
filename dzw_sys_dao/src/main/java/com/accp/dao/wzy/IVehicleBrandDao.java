package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.VehicleBrand;

public interface IVehicleBrandDao {
	// ��ѯ���г���Ʒ��
	List<VehicleBrand> queryAll();

	// ���ݱ���/����/����ĸ��ѯƷ��
	List<VehicleBrand> queryVehicleBrand(@Param("parameter1") String parameter1);

	// ��������Ʒ��
	int addVehicleBrand(@Param("vehiclebrand") VehicleBrand vehiclebrand);

	// ���ݱ���ɾ��Ʒ��
	int delVehicleBrand(@Param("vbrandid") Integer vbrandid);

	// �޸ĳ���Ʒ��
	int updateVehicleBrand(@Param("vehiclebrand") VehicleBrand vehiclebrand);
}
