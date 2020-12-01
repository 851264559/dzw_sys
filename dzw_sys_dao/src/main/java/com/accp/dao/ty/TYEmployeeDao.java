package com.accp.dao.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Postb;
import com.accp.pojo.ty.VO;

public interface TYEmployeeDao {
	
	/**
	 * 通讯名录查询
	 * @param vo
	 * @return
	 */
	public List<VO> queryAllEmployee(@Param("name")String name);
	
	/**
	 * 组织机构右侧查询
	 */
	public List<VO> queryAllVO(@Param("bid")Integer bid);
	
	/**
	 * 登录
	 */
	public Employee login(@Param("yaccount")String yaccount,@Param("ypwd")String ypwd);
	
}
