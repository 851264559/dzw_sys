package com.accp.biz.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.TestOnCompletionMapper;
import com.accp.pojo.cwl.TestOnCompletion;


@Service("testOnCompletionBiz")
public class testOnCompletionBiz {
			
			@Autowired
			private TestOnCompletionMapper tBiz;
			
			public List<TestOnCompletion> queryInfosByCondition(String startTime,String endTime,String repairOrder,String theDocumentsState,String licensePlateNumber,String VIN){
				return tBiz.queryInfosByCondition(startTime, endTime, repairOrder, theDocumentsState, licensePlateNumber, VIN);
			}
			
			public Integer modifyByPrimaryKeySelective(TestOnCompletion record) {
				return tBiz.updateByPrimaryKeySelective(record);
			}
			
			
}
