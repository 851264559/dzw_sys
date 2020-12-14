package com.accp.action.wzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wzy.SmallRepairBiz;
import com.accp.pojo.wzy.SmallRepair;

@RestController
@RequestMapping("/api/smallrepair")
public class SmallRepairAction {

	@Autowired
	private SmallRepairBiz biz;
	
	@PostMapping("/add")
	public Map<String, String> addSmallRepair(@RequestBody SmallRepair smallrepair) {
		Map<String, String> message = new HashMap<String, String>();
		if(biz.addSmallRepair(smallrepair) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "on");
		}
		return message;
	}
}
