package com.accp.biz.wzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.wzy.IGoodsTypeDao;
import com.accp.pojo.wzy.GoodsType;

@Service
public class GoodsTypeBiz {

	@Autowired
	private IGoodsTypeDao dao;
	
	public List<GoodsType> queryAll() {
		return dao.queryAll();
	}
}
