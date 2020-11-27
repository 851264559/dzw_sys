package com.accp.dao.ty;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Postb;

public interface TYPostbDao {
	
	/**
	 * 岗位定义查询
	 * @return
	 */
	@Select("SELECT * FROM `postb`")
	public List<Postb> queryAllPostb();
	
	/**
	 * 岗位定义新增
	 * @param postb
	 * @return
	 */
	@Insert("INSERT INTO `postb` VALUE(0,#{postb.zname})")
	public int saveTYPostb(@Param("postb") Postb postb);
	
	/**
	 * 岗位定义删除
	 * @param zid
	 * @return
	 */
	@Delete("DELETE FROM `postb` WHERE `zid`=#{zid}")
	public int deletezid(@Param("zid") Integer zid);
	
	/**
	 * 岗位定义修改
	 * @param postb
	 * @return
	 */
	@Update("UPDATE `postb` SET `zname`=#{postb.zname} where `zid`=#{postb.zid}")
	public int updatePostb(@Param("postb") Postb postb);
	
}
