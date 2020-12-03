package com.accp.dao.cyj;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.cyj.Perm;

public interface PermMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Perm record);

    int insertSelective(Perm record);

    Perm selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Perm record);

    int updateByPrimaryKey(Perm record);
    
    void insertPerm(@Param("rid")Integer rid,@Param("fid")List<Integer> fid,@Param("empName")String empName);
}