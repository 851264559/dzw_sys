package com.accp.biz.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.IVehicleTypeDao;
import com.accp.pojo.wzy.VehicleType;

@Service
public class VehicleTypeBiz {
	
	@Autowired
	private IVehicleTypeDao dao;
	
	public List<VehicleType> queryVehicleTypeById(Integer vbrandid){
		return dao.queryVehicleTypeById(vbrandid);
	}
	
	public List<VehicleType> queryAll(){
		return dao.queryAll();
	}
	
	public List<VehicleType> queryVehicleType(String parameter2){
		return dao.queryVehicleType(parameter2);
	}
	
	public int addVehicleType(VehicleType vehicletype) {
		return dao.addVehicleType(vehicletype);
	}
	
	public int delVehicleType(Integer vtypeid) {
		return dao.delVehicleType(vtypeid);
	}
	
	public int updateVehicleType(VehicleType vehicletype) {
		return dao.updateVehicleType(vehicletype);
	}
}
