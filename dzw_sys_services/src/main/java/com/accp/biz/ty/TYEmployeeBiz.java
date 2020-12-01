package com.accp.biz.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accp.dao.ty.TYEmployeeDao;
import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Postb;
import com.accp.pojo.ty.VO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("tyemployeeBiz")
public class TYEmployeeBiz {
	
	@Autowired
	private TYEmployeeDao dao;
	
	/**
	 * 通讯名录查询
	 * @param name
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<VO> queryVO(@Param("name")String name,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<VO>(dao.queryAllEmployee(name));
	}
	
	/**
	 * 组织机构查询
	 * @param bid
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<VO> queryVoAll(@Param("bid")Integer bid,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<VO>(dao.queryAllVO(bid));
	}
	
	/**
	 * 登录
	 * @param yaccount
	 * @param ypwd
	 * @return
	 */
	public Employee login(String yaccount,String ypwd) {
		return dao.login(yaccount, ypwd);
	}
}
