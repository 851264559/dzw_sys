package com.accp.biz.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.IVehicleBrandDao;
import com.accp.pojo.wzy.VehicleBrand;

@Service
public class VehicleBrandBiz {
	
	@Autowired
	private IVehicleBrandDao dao;
	
	public List<VehicleBrand> queryAll(){
		return dao.queryAll();
	}
	
	public List<VehicleBrand> queryVehicleBrand(String parameter1){
		return dao.queryVehicleBrand(parameter1);
	}
	
	public int addVehicleBrand(VehicleBrand vehiclebrand) {
		return dao.addVehicleBrand(vehiclebrand);
	}
	
	public int delVehicleBrand(Integer vbrandid) {
		return dao.delVehicleBrand(vbrandid);
	}
	
	public int updateVehicleBrand(VehicleBrand vehiclebrand) {
		return dao.updateVehicleBrand(vehiclebrand);
	}
}
