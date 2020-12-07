package com.accp.action.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.maintenanceItemsBiz;
import com.accp.pojo.cwl.maintenanceitems;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/maintenanceItem")
public class maintenanceItemsAction {
			
			@Autowired
			private maintenanceItemsBiz mBiz;
			
			@GetMapping("/{WorkOrderNumber}")
			public List<maintenanceitems> queryMaintenanceitemsByWorkOrderNumber(@PathVariable String WorkOrderNumber){
				return mBiz.queryMaintenanceitemsByWorkOrderNumber(WorkOrderNumber);
			}
			
			@PostMapping("/add")
			public int addMaintenanceitemsSelective(@RequestBody maintenanceitems record) {
				return mBiz.addMaintenanceitemsSelective(record);
			}
			
			@PutMapping("/modify")
			public int modifyByPrimaryKeySelective(@RequestBody maintenanceitems record) {
				return mBiz.modifyByPrimaryKeySelective(record);
			}
			
			@DeleteMapping("/{oid}")
			public int removeByPrimaryKey(@PathVariable String oid) {
				return mBiz.removeByPrimaryKey(oid);
			}
			
			@GetMapping("/carNum/{CarNumber}")
			public List<maintenanceitems> queryMaintenanceitemsByCarNumber(@PathVariable String CarNumber){
				return mBiz.queryMaintenanceitemsByCarNumber(CarNumber);
			}
			
			@GetMapping("/day/{date}")
			public List<maintenanceitems> queryMaintenanceitemsByDay(@PathVariable String date){
				return mBiz.queryMaintenanceitemsByDay(date);
			}
}
