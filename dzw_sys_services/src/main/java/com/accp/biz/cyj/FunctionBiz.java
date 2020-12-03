package com.accp.biz.cyj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cyj.FunctionMapper;
import com.accp.pojo.cyj.Function;


@Service
public class FunctionBiz {
	
	@Autowired
	private FunctionMapper functionDao;
	
	/**
	 * 查询所有功能
	 * @return
	 */
	public List<Function> findFunctionAll(){
		return functionDao.selectFunctionAll();
	}
	
	/**
	 * 查询角色功能
	 * @return
	 */
	public List<Integer> findFunctionId(Integer zid){
		return functionDao.selectFunctionId(zid);
	}

}
