package com.accp.action.wzy;

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

import com.accp.biz.wzy.VehicleBrandBiz;
import com.accp.pojo.wzy.VehicleBrand;

@RestController
@RequestMapping("/api/vehiclebrand")
public class VehicleBrandAction {

	@Autowired
	private VehicleBrandBiz biz;
	
	@PutMapping("vehiclebrand")
	public Map<String, String> updateVehicleBrand(@RequestBody VehicleBrand vehiclebrand) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.updateVehicleBrand(vehiclebrand)>0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@DeleteMapping("/del/{vbrandid}")
	public Map<String, String> delVehicleBrand(@PathVariable Integer vbrandid) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.delVehicleBrand(vbrandid) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@PostMapping("/add")
	public Map<String, String> addVehicleBrand(@RequestBody VehicleBrand vehiclebrand) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.addVehicleBrand(vehiclebrand) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@GetMapping("/{parameter1}")
	public List<VehicleBrand> queryVehicleBrand(@PathVariable String parameter1){
		return biz.queryVehicleBrand(parameter1);
	}
	
	@GetMapping
	public List<VehicleBrand> queryAll(){
		return biz.queryAll();
	}
}
