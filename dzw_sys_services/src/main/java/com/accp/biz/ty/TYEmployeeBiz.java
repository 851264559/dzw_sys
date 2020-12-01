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
	
<<<<<<< HEAD
	//部门下拉框绑定
	public List<Ment> queryMent(){
		return dao.queryAllMent();
	}
	
	//职位部门下拉框绑定
	public List<Postb> queryPostb(){
		return dao.queryAllPostb();
	}
	
	//新增员工
	public void addEmployee(Employee employee) {
		dao.saveEdocentry(employee);
	}
	
	//修改页面查询
	public Employee getEmployee(Integer yid) {
		return dao.loadEmployee(yid);
	}
	
	//员工删除
	public void removeyid(Integer yid) {
		dao.deleteyid(yid);
=======
	/**
	 * 登录
	 * @param yaccount
	 * @param ypwd
	 * @return
	 */
	public Employee login(String yaccount,String ypwd) {
		return dao.login(yaccount, ypwd);
>>>>>>> 7d3bfb1e933ea2aef76f9783a1a2848c8df12726
	}
}
