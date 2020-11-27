package com.accp.biz.ty;
import java.util.List;
import com.accp.pojo.ty.Postb;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accp.dao.ty.TYPostbDao;

@Service("typostbBiz")
public class TYPostbBiz {

	@Autowired
	private TYPostbDao dao;
	
	/**
	 * 岗位定义查询
	 * @return
	 */
	public PageInfo<Postb> queryPostb(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Postb>(dao.queryAllPostb());
	}
	
	//岗位定义删除
	public void removezid(Integer zid) {
		dao.deletezid(zid);
	}
	
	//岗位定义新增
	public void addPostb(Postb postb) {
		dao.saveTYPostb(postb);
	}
	
	//岗位定义修改
	public void modifyPostb(Postb postb) {
		dao.updatePostb(postb);
	}
	
}
