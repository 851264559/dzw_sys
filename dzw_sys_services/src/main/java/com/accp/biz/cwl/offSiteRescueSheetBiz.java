package com.accp.biz.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.cwl.OffSiteRescueSheetMapper;
import com.accp.pojo.cwl.OffSiteRescueSheet;

@Service("offSiteRescueSheet")
public class offSiteRescueSheetBiz {
			
			@Autowired
			private OffSiteRescueSheetMapper oM;
			
			public OffSiteRescueSheet selectOffSiteRescueSheetInfosByOddnumber(String oddnumber) {
				return oM.selectOffSiteRescueSheetInfosByOddnumber(oddnumber);
			}
			
			public Integer modifyOffSiteRescueSheetInfoSelective(OffSiteRescueSheet record) {
				return oM.updateByPrimaryKeySelective(record);
			}
			
			public int addSelective(OffSiteRescueSheet record) {
				return oM.insertSelective(record);
			}
}
