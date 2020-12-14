package com.accp.dao.wzy;

import java.util.List;

import com.accp.pojo.wzy.GoodsType;

public interface IGoodsTypeDao {
	
	//查询所有类别
	List<GoodsType> queryAll();
}
