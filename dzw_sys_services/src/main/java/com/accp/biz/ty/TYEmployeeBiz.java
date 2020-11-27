package com.accp.biz.ty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ty.TYEmployeeDao;

@Service("tyemployeeBiz")
public class TYEmployeeBiz {
	
	@Autowired
	private TYEmployeeDao dao;
	
	
}
