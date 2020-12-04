package com.accp.dao.cwl;

import com.accp.pojo.cwl.closeanaccount;
import org.apache.ibatis.annotations.Param;

import java.util.*;

public interface closeanaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(closeanaccount record);

    List<closeanaccount> selectAll(@Param("zt") String zt);

    int insertSelective(closeanaccount record);

    int updateZhuangtai(closeanaccount record);

    closeanaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(closeanaccount record);

    int updateByPrimaryKey(closeanaccount record);
}