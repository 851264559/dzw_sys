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

import com.accp.biz.cwl.fieldOfVehicleBiz;
import com.accp.pojo.cwl.FieldOfVehicle;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/fieldOfVehicle")
public class fieldOfVehicleAction {
			
			@Autowired
			private fieldOfVehicleBiz fBiz;
			
			@GetMapping("/queryAll")
			public List<FieldOfVehicle>  queryAllFieldOfVehicleInfos(){
				return fBiz.queryFieldOfVehicle();
			}
			
			@PostMapping("/saveFieldOfVehicle")
			public Map<String, String> addFieldOfVehicleInfos(@RequestBody FieldOfVehicle record){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(fBiz.addFieldOfVehicleInfos(record)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
			@PutMapping("/modifyFieldOfVehicle")
			public Map<String, String> modifyFieldOfVehicleInfos(@RequestBody FieldOfVehicle record){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(fBiz.modifyFieldOfVehicleInfos(record)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
			@DeleteMapping("/FieldOfVehicle/{carnumber}")
			public Map<String, String> removeFieldOfVehicleInfos(@PathVariable String carnumber){
				Map<String,String> resultMap = new HashMap<String, String>();
				if(fBiz.removeFieldOfVehicleInfos(carnumber)>0) {
					resultMap.put("code", "200");
					resultMap.put("msg", "success");
				}else {
					resultMap.put("code", "300");
					resultMap.put("msg", "error");
				}
				return resultMap;
			}
			
}
