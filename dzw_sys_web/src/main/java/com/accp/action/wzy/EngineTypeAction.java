package com.accp.action.wzy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wzy.EngineTypeBiz;
import com.accp.pojo.wzy.EngineType;

@RestController
@RequestMapping("api/enginetype")
public class EngineTypeAction {
	@Autowired
	private EngineTypeBiz biz;
	
	@GetMapping("/{enginetypename}")
	public List<EngineType> queryEngineType(@PathVariable String enginetypename) {
		return biz.queryEngineType(enginetypename);
	}
	
	@DeleteMapping("/del/{enginetypeid}")
	public Map<String, String> delEngineType(@PathVariable Integer enginetypeid){
		Map<String, String> message = new HashMap<String, String>();
		if(biz.delEngineType(enginetypeid) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@PostMapping("/add")
	public Map<String, String> addEngineType(@RequestBody EngineType engineType) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.addEngineType(engineType) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
	
	@GetMapping
	public List<EngineType> queryAll(){
		return biz.queryAll();
	}
	
}
