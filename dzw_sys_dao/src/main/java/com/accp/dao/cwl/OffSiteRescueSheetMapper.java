package com.accp.dao.cwl;

import com.accp.pojo.cwl.OffSiteRescueSheet;

public interface OffSiteRescueSheetMapper {
    int deleteByPrimaryKey(String oddnumber);

    int insert(OffSiteRescueSheet record);

    int insertSelective(OffSiteRescueSheet record);

    OffSiteRescueSheet selectByPrimaryKey(String oddnumber);

    int updateByPrimaryKeySelective(OffSiteRescueSheet record);

    int updateByPrimaryKey(OffSiteRescueSheet record);
}