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

import com.accp.biz.wzy.VehicleTypeBiz;
import com.accp.pojo.wzy.VehicleType;

@RestController
@RequestMapping("/api/vehicletype")
public class VehicleTypeAction {

	@Autowired
	private VehicleTypeBiz biz;

	@PutMapping("vehicletype")
	public Map<String, String> updateVehicleType(@RequestBody VehicleType vehicletype) {
		Map<String, String> message = new HashMap<String, String>();
		if (biz.updateVehicleType(vehicletype) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}

	@DeleteMapping("/del/{vtypeid}")
	public Map<String, String> delVehicleType(@PathVariable Integer vtypeid) {
		Map<String, String> message = new HashMap<String, String>();
		if (biz.delVehicleType(vtypeid) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}

	@PostMapping("/add")
	public Map<String, String> addVehicleType(@RequestBody VehicleType vehicletype) {
		Map<String, String> message = new HashMap<String, String>();
		if (biz.addVehicleType(vehicletype) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}

	@GetMapping("/ById/{vbrandid}")
	public List<VehicleType> queryVehicleTypeById(@PathVariable Integer vbrandid) {
		return biz.queryVehicleTypeById(vbrandid);
	}
	
	@GetMapping("/{parameter2}")
	public List<VehicleType> queryVehicleType(@PathVariable String parameter2) {
		return biz.queryVehicleType(parameter2);
	}

	@GetMapping
	public List<VehicleType> queryAll() {
		return biz.queryAll();
	}
}
