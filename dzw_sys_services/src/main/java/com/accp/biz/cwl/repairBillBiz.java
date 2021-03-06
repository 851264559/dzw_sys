package com.accp.biz.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.RepairBillMapper;
import com.accp.pojo.cwl.RepairBill;

@Service("repairBillBiz")
public class repairBillBiz {
			
			@Autowired
			private RepairBillMapper rM;
			
			public RepairBill selectRepairBillInfosByRoddnumber(String roddnumber) {
				return rM.selectRepairBillInfosByRoddnumber(roddnumber);
			}
			
			public int addSelective(RepairBill record) {
				return rM.insert(record);
			}
}
