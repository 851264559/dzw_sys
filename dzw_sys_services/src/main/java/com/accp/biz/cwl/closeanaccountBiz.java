package com.accp.biz.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.closeanaccountMapper;
import com.accp.pojo.cwl.closeanaccount;

@Service("closeanaccountBiz")
public class closeanaccountBiz {
		
		@Autowired
		private closeanaccountMapper cM;
		
		public Integer addSelective(closeanaccount record) {
			return cM.insertSelective(record);
		}
}
