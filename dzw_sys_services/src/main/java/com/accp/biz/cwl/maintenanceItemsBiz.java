package com.accp.biz.cwl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.maintenanceitemsMapper;
import com.accp.pojo.cwl.maintenanceitems;

@Service("maintenanceItemsBiz")
public class maintenanceItemsBiz {
			
			@Autowired
			private maintenanceitemsMapper mM;
			
			public List<maintenanceitems> queryMaintenanceitemsByWorkOrderNumber(String WorkOrderNumber){
				return mM.queryMaintenanceitemsByWorkOrderNumber(WorkOrderNumber);
			}
			
			public int addMaintenanceitemsSelective(maintenanceitems record) {
				return mM.insertSelective(record);
			}
}
