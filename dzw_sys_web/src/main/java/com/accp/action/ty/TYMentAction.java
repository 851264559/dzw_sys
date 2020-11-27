package com.accp.action.ty;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ty.TYMentBiz;
import com.accp.pojo.ty.Ment;

@RestController
@RequestMapping("/ty/api/ment")
public class TYMentAction {
	
	@Autowired
	private TYMentBiz biz;
	
	@GetMapping("b")
	public List<Ment> getMent() {
		return biz.queryTYMent();
	}
}
