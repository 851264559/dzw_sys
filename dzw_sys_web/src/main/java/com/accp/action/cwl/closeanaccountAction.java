package com.accp.action.cwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.closeanaccountBiz;
import com.accp.pojo.cwl.closeanaccount;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/closeanaccount")
public class closeanaccountAction {
			
			@Autowired
			private closeanaccountBiz cBiz;
			
			@PostMapping("/add")
			public Integer addSelective(@RequestBody closeanaccount record) {
				return cBiz.addSelective(record);
			}
}
