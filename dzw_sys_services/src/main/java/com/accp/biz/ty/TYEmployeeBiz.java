package com.accp.biz.ty;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accp.dao.ty.TYEmployeeDao;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Postb;
import com.accp.pojo.ty.VO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("tyemployeeBiz")
public class TYEmployeeBiz {
	
	@Autowired
	private TYEmployeeDao dao;
	
	//通讯名录查询
	public PageInfo<VO> queryVO(@Param("name")String name,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<VO>(dao.queryAllEmployee(name));
	}
}
