package com.accp.biz.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.IRepairDao;
import com.accp.pojo.wzy.Repair;

@Service
public class RepairBiz {
	
	@Autowired
	private IRepairDao dao;
	
	public int delRepair(Integer rid) {
		return dao.delRepair(rid);
	}
	
	public int updateRepair(Repair repair) {
		return dao.updateRepair(repair);
	}
	
	public int addRepair(Repair repair) {
		return dao.addRepair(repair);
	}
	
	public List<Repair> queryRepairByXtype(Integer xtype) {
		return dao.queryRepairByXtype(xtype);
	}
	
	public Repair queryRepairByRid(Integer rid) {
		return dao.queryRepairByRid(rid);
	}
	
	public List<Repair> queryAll(){
		return dao.queryAll();
	}
}
