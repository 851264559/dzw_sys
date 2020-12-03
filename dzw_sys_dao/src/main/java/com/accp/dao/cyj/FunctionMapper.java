package com.accp.dao.cyj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cyj.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
    
    /**
     * 查询所有功能
     * @return
     */
    List<Function> selectFunctionAll();
    
    /**
     * 查询角色功能
     * @return
     */
    @Select("SELECT f.fid FROM `postb` p \r\n" + 
    		"INNER JOIN `tbl_perm`  pe ON pe.`rid`= p.`zid`\r\n" + 
    		"INNER JOIN `tbl_function` f ON f.`fid`=pe.`fid`\r\n" + 
    		"WHERE p.`zid`=#{zid} AND pe.`fid`>7")
    List<Integer> selectFunctionId(@Param("zid")Integer zid);
    
}