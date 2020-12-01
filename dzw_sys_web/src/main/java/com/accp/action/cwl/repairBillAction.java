package com.accp.action.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.repairBillBiz;
import com.accp.pojo.cwl.RepairBill;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/repairBill")
public class repairBillAction {
			
			@Autowired
			private repairBillBiz rBiz;
			
			@GetMapping("/{roddnumber}")
			public RepairBill selectRepairBillInfosByRoddnumber(@PathVariable String roddnumber) {
				return rBiz.selectRepairBillInfosByRoddnumber(roddnumber);
			}
	
}
