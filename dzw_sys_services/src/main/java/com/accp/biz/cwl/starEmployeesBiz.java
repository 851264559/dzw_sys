package com.accp.biz.cwl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.staremployeesMapper;
import com.accp.pojo.cwl.staremployees;

@Service("starEmployeesBiz")
public class starEmployeesBiz {
	
		@Autowired 
		private staremployeesMapper sM;
		
		public List<staremployees> queryAllStarEmployeesInfos(){
			return sM.queryAllStarEmployeesInfos();
		}
		
		public int addStarEmployeesInfos(staremployees record) {
			return sM.insert(record);
		}
		
		public int removeStarEmployeesInfos(Integer id) {
			return sM.deleteByPrimaryKey(id);
		}
		
		public int modifyStarEmployeesInfos(staremployees record) {
			return sM.updateByPrimaryKeySelective(record);
		}
	
}
