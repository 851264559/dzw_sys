package com.accp.biz.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.IEngineTypeDao;
import com.accp.pojo.wzy.EngineType;

@Service
public class EngineTypeBiz {
	
	@Autowired
	private IEngineTypeDao dao;
	
	public List<EngineType> queryEngineType(String enginetypename) {
		return dao.queryEngineType(enginetypename);
	}
	
	public int delEngineType(Integer enginetypeid) {
		return dao.delEngineType(enginetypeid);
	}
	
	public int addEngineType(EngineType engineType) {
		return dao.addEngineType(engineType);
	}
	
	public List<EngineType> queryAll(){
		return dao.queryAll();
	}
	
}
