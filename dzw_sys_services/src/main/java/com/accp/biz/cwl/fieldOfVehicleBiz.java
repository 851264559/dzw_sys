package com.accp.biz.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.FieldOfVehicleMapper;
import com.accp.pojo.cwl.FieldOfVehicle;

@Service("fieldOfVehicleBiz")
public class fieldOfVehicleBiz {
	
			@Autowired
			private FieldOfVehicleMapper fM;
			
			public List<FieldOfVehicle> queryFieldOfVehicle(){
				return fM.queryFieldOfVehicle();
			}
			
			public int addFieldOfVehicleInfos(FieldOfVehicle record) {
				return fM.insert(record);
			}
			
			public int modifyFieldOfVehicleInfos(FieldOfVehicle record) {
				return fM.updateByPrimaryKeySelective(record);
			}
			
			public int removeFieldOfVehicleInfos(String carnumber) {
				return fM.deleteByPrimaryKey(carnumber);
			}
}
