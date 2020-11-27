package com.accp.action.cwl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cwl.starEmployeesBiz;
import com.accp.pojo.cwl.staremployees;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/starEmployees")
public class StarEmployeesAction {
			
			@Autowired
			private starEmployeesBiz sBiz;
			
			@GetMapping("/queryAll")
			public List<staremployees>  queryAllStarEmployeesInfos(){
				return sBiz.queryAllStarEmployeesInfos();
			}
			
			@PostMapping("/saveStarEmployees")
			public Map<String, String> addStarEmployeesInfos(@RequestBody staremployees record){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(sBiz.addStarEmployeesInfos(record)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
			@PutMapping("/modifyStarEmployees")
			public Map<String, String> modifyStarEmployeesInfos(@RequestBody staremployees record){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(sBiz.modifyStarEmployeesInfos(record)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
			@DeleteMapping("/starEmployee/{id}")
			public Map<String, String> removeStarEmployeesInfos(@PathVariable Integer id){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(sBiz.removeStarEmployeesInfos(id)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
}
