package com.accp.dao.cwl;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.cwl.Team;
import com.accp.pojo.cwl.bzjgVO;
import com.accp.pojo.cwl.shiftthemechanic;
import com.accp.pojo.cwl.staremployees;
import com.accp.pojo.ty.Employee;

public interface bzjg {
	
	/**
	 * 班组查询
	 * @return
	 */
	@Select("SELECT * FROM `team`")
	public List<Team> queryTeam();
	
	/**
	 * 班组新增
	 * @return
	 */
	@Insert("INSERT INTO `team` VALUE(0,#{team.tename})")
	public int saveTeam(@Param("team") Team team);
	
	/**
	 * 班组删除
	 * @return
	 */
	@Delete("DELETE FROM `team` WHERE `teid`=#{teid}")
	public int deleteTeam(@Param("teid") Integer teid);
	
	/**
	 * 班组修改
	 * @return
	 */
	@Update("UPDATE `team` SET `tename`=#{team.tename} where `teid`=#{team.teid}")
	public int updateTeam(@Param("team") Team team);
	
	/**
	 * 班组技工查询
	 * @param bid
	 * @return
	 */
	public List<bzjgVO> querybzjg(@Param("steam")Integer steam);
	
	/**
	 * 班组下拉框绑定
	 * @return
	 */
	@Select("SELECT * FROM `team`")
	public List<Team> queryTeamAll();
	
	/**
	 * 班组星级下拉框绑定
	 * @return
	 */
	@Select("SELECT * FROM `staremployees`")
	public List<staremployees> queryStar();
	
	/**
	 * 新增技工
	 * @param employee
	 * @return
	 */
	@Insert("INSERT INTO `shiftthemechanic`(`aname`,`asex`,`aphone`,`steam`,`starlevel`)\r\n" + 
			" VALUE(#{shiftthemechanic.aname},#{shiftthemechanic.asex},#{shiftthemechanic.aphone},\r\n" + 
			" #{shiftthemechanic.steam},#{shiftthemechanic.starlevel})")
	public int saveShiftthemechanic(@Param("shiftthemechanic") shiftthemechanic shiftthemechanic);

	/**
	 * 技工删除
	 * @param aid
	 * @return
	 */
	@Delete("DELETE FROM `shiftthemechanic` WHERE `aid`=#{aid}")
	public int deleteaid(@Param("aid") Integer aid);
	
	//判断该班组是否有人
	@Select("SELECT COUNT(s.`steam`) FROM `shiftthemechanic` s\r\n" + 
			" INNER JOIN `team` t ON t.`teid`=s.`steam`\r\n" + 
			" WHERE s.`steam`=#{steam}")
	public int queryBz(@Param("steam") Integer steam);
	
}
