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
import com.accp.biz.ty.TYPostbBiz;
import com.accp.pojo.ty.Postb;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/ty/api/postb")
public class TYPostbAction {
	
	@Autowired
	private TYPostbBiz biz;
	
	//查询
	@GetMapping("o/{p}/{s}")
	public PageInfo<Postb> getpostb(@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryPostb(p, s);
	}
	
	//新增
	@PostMapping("xz")
	public Map<String, String> addpostbAll(@RequestBody Postb postb) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addPostb(postb);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//删除
	@DeleteMapping("hhh/{zid}")
	public Map<String, String> delpostbInfo(@PathVariable Integer zid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.removezid(zid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PutMapping("dd/Postb")
	public Map<String, String> updatePostbInfo(@RequestBody Postb postb) {
		Map<String, String> message = new HashMap<String, String>();
		biz.modifyPostb(postb);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

}
