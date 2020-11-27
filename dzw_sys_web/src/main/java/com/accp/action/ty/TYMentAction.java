package com.accp.action.ty;
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

import com.accp.biz.ty.TYMentBiz;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Postb;

@RestController
@RequestMapping("/ty/api/ment")
public class TYMentAction {
	
	@Autowired
	private TYMentBiz biz;
	
	//查询
	@GetMapping("b")
	public List<Ment> getMent() {
		return biz.queryTYMent();
	}
	
	//新增
	@PostMapping("xz")
	public Map<String, String> addMentAll(@RequestBody Ment ment) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addMent(ment);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//删除
	@DeleteMapping("hhh/{bid}")
	public Map<String, String> delMentInfo(@PathVariable Integer bid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.removebid(bid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PutMapping("dd/Postb")
	public Map<String, String> updateMentInfo(@RequestBody Ment ment) {
		Map<String, String> message = new HashMap<String, String>();
		System.out.println(ment);
		biz.modifyMent(ment);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
