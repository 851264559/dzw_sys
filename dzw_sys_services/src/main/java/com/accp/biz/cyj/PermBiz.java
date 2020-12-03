package com.accp.biz.cyj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cyj.PermMapper;

@Service
public class PermBiz {
	
	@Autowired
	private PermMapper permDao;
	
	/**
	 * 新增权限
	 */
	public void addPerm(Integer rid,List<Integer> fid,String empName) {
		permDao.insertPerm(rid, fid, empName);
	}

}
