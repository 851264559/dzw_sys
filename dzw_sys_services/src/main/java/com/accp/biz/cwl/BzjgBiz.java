package com.accp.biz.cwl;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accp.dao.cwl.bzjg;
import com.accp.pojo.cwl.Team;
import com.accp.pojo.cwl.bzjgVO;
import com.accp.pojo.cwl.shiftthemechanic;
import com.accp.pojo.cwl.staremployees;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("bzjgBiz")
public class BzjgBiz {
	
	@Autowired
	private bzjg dao;
	
	//班组查询
	public List<Team> queryTeam(){
		return dao.queryTeam();
	}
	
	//班组名称删除
	public void removeteid(Integer teid) {
		dao.deleteTeam(teid);
	}
	
	//班组名称新增
	public void addTeam(Team team) {
		dao.saveTeam(team);
	}
	
	//班组名称修改
	public void modifyTeam(Team team) {
		dao.updateTeam(team);
	}
	
	//班组技工查询
	public PageInfo<bzjgVO> querybzjgVo(@Param("steam")Integer steam,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<bzjgVO>(dao.querybzjg(steam));
	}
	
	//班组下拉框绑定
	public List<Team> queryMent(){
		return dao.queryTeamAll();
	}
	
	//班组星级下拉框绑定
	public List<staremployees> queryStar(){
		return dao.queryStar();
	}
	
	//新增技工
	public void addShiftthemechanic(shiftthemechanic shiftthemechanic) {
		dao.saveShiftthemechanic(shiftthemechanic);
	}
	
	//技工删除
	public void removeaid(Integer aid) {
		dao.deleteaid(aid);
	}
	
	//判断该班组是否有人
	public int queryBz(@Param("steam") Integer steam){
		return dao.queryBz(steam);
	}

}
