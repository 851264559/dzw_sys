package com.accp.action.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.offSiteRescueSheetBiz;
import com.accp.pojo.cwl.OffSiteRescueSheet;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/offSiteRescueSheet")
public class offSiteRescueSheetAction {
			
			@Autowired
			private offSiteRescueSheetBiz oBiz;
			
			@GetMapping("/{oddnumber}")
			public OffSiteRescueSheet selectOffSiteRescueSheetInfosByOddnumber(@PathVariable String oddnumber) {
				return oBiz.selectOffSiteRescueSheetInfosByOddnumber(oddnumber);
			}
			
			@PutMapping("/modify")
			public Integer modifyOffSiteRescueSheetInfoSelective(@RequestBody OffSiteRescueSheet record) {
				return oBiz.modifyOffSiteRescueSheetInfoSelective(record);
			}
			
			@PostMapping("/add")
			public int addSelective(@RequestBody OffSiteRescueSheet record) {
				return oBiz.addSelective(record);
			}
}
