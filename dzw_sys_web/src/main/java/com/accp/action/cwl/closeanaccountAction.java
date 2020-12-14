package com.accp.action.cwl;

import com.accp.vo.ct.CloseanaccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.accp.biz.cwl.closeanaccountBiz;
import com.accp.pojo.cwl.closeanaccount;
import java.util.*;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/closeanaccount")
public class closeanaccountAction {
			
			@Autowired
			private closeanaccountBiz cBiz;
			
			@PostMapping("/add")
			public Integer addSelective(@RequestBody closeanaccount record) {
				return cBiz.addSelective(record);
			}

			@PostMapping("/selectAll")
			public List<closeanaccount> selectAll(@RequestBody CloseanaccountVO cc){
				return cBiz.selectAll(cc);
			}

			@PutMapping("/update")
			public boolean updateZhuangtai(@RequestBody closeanaccount closeanaccount){
				if(cBiz.updateZhuangtai(closeanaccount)>0){
					return true;
				}
				return false;
			}

			@GetMapping("/selectCount")
			public Map<String,Integer> selectCount(){
				return cBiz.selectCount();
			}
}
