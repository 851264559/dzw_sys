package com.accp.dao.ty;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.ty.Ment;

public interface TYMentDao {
	
	/**
	 * 部门查询
	 * @param tyment
	 * @return
	 */
	@Select("SELECT * FROM `ment`")
	public List<Ment> queryAllMent();
	
	/**
	 * 部门新增
	 * @param tyment
	 * @return
	 */
	@Insert("INSERT INTO `ment` VALUE(0,#{ment.bname})")
	public int saveTYMent(@Param("ment") Ment ment);
	
	/**
	 * 部门删除
	 * @param bid
	 * @return
	 */
	@Delete("DELETE FROM `ment` WHERE `bid`=#{bid}")
	public int deletebid(@Param("bid") Integer bid);
	
	/**
	 * 部门修改
	 * @param ment
	 * @return
	 */
	@Update("UPDATE `ment` SET `bname`=#{ment.bname} where `bid`=#{ment.bid}")
	public int updateMent(@Param("ment") Ment ment);
	
}
