package com.accp.biz.cwl;

import com.accp.vo.ct.CloseanaccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.accp.dao.cwl.closeanaccountMapper;
import com.accp.pojo.cwl.closeanaccount;

@Service("closeanaccountBiz")
public class closeanaccountBiz {
		
		@Autowired
		private closeanaccountMapper cM;
		
		public Integer addSelective(closeanaccount record) {
			return cM.insertSelective(record);
		}

		public List<closeanaccount> selectAll(CloseanaccountVO cc){
			return cM.selectAll(cc);
		}

		public int updateZhuangtai(closeanaccount closeanaccount){
			return cM.updateZhuangtai(closeanaccount);
		}

		public Map<String,Integer> selectCount(){
			Map<String,Integer> map=new HashMap<>();
			map.put("count1",cM.selectCount1("现金","已结算"));
			map.put("count2",cM.selectCount2("已结算"));
			return map;
		}
}
