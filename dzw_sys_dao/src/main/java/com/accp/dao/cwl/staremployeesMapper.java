package com.accp.dao.cwl;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.staremployees;
/**
 * 	技工星级表
 * @author 团子等等俺
 *
 */
public interface staremployeesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(staremployees record);

    int insertSelective(staremployees record);

    staremployees selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(staremployees record);

    int updateByPrimaryKey(staremployees record);
    
    @Select("SELECT * FROM staremployees")
    public List<staremployees> queryAllStarEmployeesInfos();
    
}