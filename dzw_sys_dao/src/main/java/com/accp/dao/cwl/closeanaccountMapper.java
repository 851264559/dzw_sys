package com.accp.dao.cwl;

import com.accp.pojo.cwl.closeanaccount;
import com.accp.vo.ct.CloseanaccountVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.*;

public interface closeanaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(closeanaccount record);

    List<closeanaccount> selectAll(@Param("cc") CloseanaccountVO cc);

    List<closeanaccount> selectHaveread();

    int insertSelective(closeanaccount record);

    int updateZhuangtai(closeanaccount record);

    closeanaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(closeanaccount record);

    int updateByPrimaryKey(closeanaccount record);

    /**
     * 每日现金收入
     * @return
     */
    @Select("SELECT SUM(`clearingMoney`) FROM `closeanaccount` WHERE `timeOfCompletion` BETWEEN CURRENT_DATE AND CURRENT_DATE AND `clearing`=#{0} AND zhuangtai=#{1}")
    int selectCount1(String s1,String s2);

    /**
     * 每日结单数量
     * @return
     */
    @Select("SELECT COUNT(*) FROM `closeanaccount` WHERE `timeOfCompletion` BETWEEN CURRENT_DATE AND CURRENT_DATE AND zhuangtai=#{0}")
    int selectCount2(String s1);
}