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

import com.accp.biz.wzy.RepairBiz;
import com.accp.pojo.wzy.Repair;

@RestController
@RequestMapping("/api/repair")
public class RepairAction {

	@Autowired
	private RepairBiz biz;
	
	@PutMapping("repair")
	public Map<String, String> updateRepair(@RequestBody Repair repair) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.updateRepair(repair)>0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@DeleteMapping("/del/{rid}")
	public Map<String, String> delRepair(@PathVariable Integer rid) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.delRepair(rid) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@PostMapping("/add")
	public Map<String, String> addRepair(@RequestBody Repair repair) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.addRepair(repair) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@GetMapping("/xtype/{xtype}")
	public List<Repair> queryRepairByXtype(@PathVariable Integer xtype) {
		return biz.queryRepairByXtype(xtype);
	}
	
	@GetMapping("/rid/{rid}")
	public Repair queryRepairByRid(@PathVariable Integer rid) {
		return biz.queryRepairByRid(rid);
	}
	
	@GetMapping
	public List<Repair> queryAll() {
		return biz.queryAll();
	}
}
