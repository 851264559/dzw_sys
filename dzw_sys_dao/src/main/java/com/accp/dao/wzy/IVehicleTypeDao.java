package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.VehicleType;

public interface IVehicleTypeDao {
	// ��ѯ���г����ͺ�
	List<VehicleType> queryAll();

	// ��ѯ���г����ͺ�
	List<VehicleType> queryVehicleTypeById(@Param("vbrandid")Integer vbrandid);
	
	// ���ݳ��ͱ���/�������Ʋ�ѯ����
	List<VehicleType> queryVehicleType(@Param("parameter2") String parameter2);

	// ��������Ʒ��
	int addVehicleType(@Param("vehicletype") VehicleType vehicletype);

	// ���ݱ���ɾ��Ʒ��
	int delVehicleType(@Param("vtypeid") Integer vtypeid);

	// �޸ĳ���Ʒ��
	int updateVehicleType(@Param("vehicletype") VehicleType vehicletype);
}
