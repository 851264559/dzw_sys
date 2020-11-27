package com.accp.dao.wzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.wzy.EngineType;

/**
 * 发动机品牌Dao层
 * @author wzy
 *
 */
public interface IEngineTypeDao {
	
	//查询所有发动机品牌
	List<EngineType> queryAll();
	
	//新增发动机品牌
	int addEngineType(@Param("enginetypename")String enginetypename);
	
	//根据id删除发动机品牌
	int delEngineType(@Param("enginetypeid")Integer enginetypeid);
	
	//根据品牌名称查询
	EngineType queryEngineType(@Param("enginetypename")String enginetypename);
}
