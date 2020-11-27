package com.accp.biz.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ty.TYMentDao;
import com.accp.pojo.ty.Ment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("tymentBiz")
public class TYMentBiz {
	
	@Autowired
	private TYMentDao dao;
	
	//部门查询
	public List<Ment> queryTYMent(){
		return dao.queryAllMent();
	}
	
	//部门名称删除
	public void removebid(Integer bid) {
		dao.deletebid(bid);
	}
	
	//部门名称新增
	public void addMent(Ment ment) {
		dao.saveTYMent(ment);
	}
	
	//部门名称修改
	public void modifyMent(Ment ment) {
		dao.updateMent(ment);
	}
	
}
