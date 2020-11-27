package com.accp.biz.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.staremployeesMapper;
import com.accp.pojo.cwl.staremployees;


@Service("testBiz")
public class testBiz {
			
			@Autowired 
			private staremployeesMapper sM;
			
			public List<staremployees> queryAllStarEmployeesInfos(){
				return sM.queryAllStarEmployeesInfos();
			}
			
			public int add(staremployees record) {
				return sM.insert(record);
			}
}
