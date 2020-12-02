package com.accp.dao.cwl;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.cwl.OffSiteRescueSheet;

public interface OffSiteRescueSheetMapper {
    int deleteByPrimaryKey(String oddnumber);

    int insert(OffSiteRescueSheet record);

    int insertSelective(OffSiteRescueSheet record);

    OffSiteRescueSheet selectByPrimaryKey(String oddnumber);

    int updateByPrimaryKeySelective(OffSiteRescueSheet record);

    int updateByPrimaryKey(OffSiteRescueSheet record);
    
    @Select("SELECT * FROM OffSiteRescueSheet WHERE OddNumber = #{oNum}")
    public OffSiteRescueSheet selectOffSiteRescueSheetInfosByOddnumber(@Param("oNum") String oddnumber);
}