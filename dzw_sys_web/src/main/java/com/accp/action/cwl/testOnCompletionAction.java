package com.accp.action.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.testOnCompletionBiz;
import com.accp.pojo.cwl.TestOnCompletion;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/testOnCompletion")
public class testOnCompletionAction {
			
		@Autowired
		private testOnCompletionBiz tOCBiz;
		
		@GetMapping("/queryByCondition/{sTime}/{eTime}/{rOrder}/{tDState}/{lPNumber}/{vin}")
		public List<TestOnCompletion> queryInfosByCondition(@PathVariable("sTime") String startTime,
				@PathVariable("eTime") String endTime,
				@PathVariable("rOrder") String repairOrder,
				@PathVariable("tDState") String theDocumentsState,
				@PathVariable("lPNumber") String licensePlateNumber,
				@PathVariable("vin") String VIN){
			return tOCBiz.queryInfosByCondition(startTime, endTime, repairOrder, theDocumentsState, licensePlateNumber, VIN);
		}
		
		@PutMapping("/modify")
		public Integer modifyByPrimaryKeySelective(@RequestBody TestOnCompletion record) {
			return tOCBiz.modifyByPrimaryKeySelective(record);
		}
}
