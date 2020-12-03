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
	
	//修改员工
	public void modifyEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}
	
	//员工删除
	public void removeyid(Integer yid) {
		dao.deleteyid(yid);
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
	
	//离职登记查询
	public PageInfo<VO> queryText(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<VO>(dao.queryAlltext());
	}
	
	//离职登记回滚
	public void modifyText(@Param("yid") Integer yid) {
		dao.updateText(yid);
	}
	
	//查询离职登记新增里的部门姓名
	public List<VO> queryVOxz(@Param("ymentid") Integer ymentid){
		return dao.queryMentxz(ymentid);
	}
	
}
