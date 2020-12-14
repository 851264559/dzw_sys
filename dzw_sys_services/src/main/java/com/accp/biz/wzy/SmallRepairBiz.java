package com.accp.biz.wzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.ISmallRepairDao;
import com.accp.pojo.wzy.SmallRepair;

@Service
public class SmallRepairBiz {
	
	@Autowired
	private ISmallRepairDao dao;
	
	public int addSmallRepair(SmallRepair smallrepair) {
		return dao.addSmallRepair(smallrepair);
	}
}
