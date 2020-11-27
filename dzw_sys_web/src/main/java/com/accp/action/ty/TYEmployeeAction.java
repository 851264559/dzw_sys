package com.accp.action.ty;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.biz.ty.TYEmployeeBiz;
import com.accp.biz.ty.TYMentBiz;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.VO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/ty/api/employee")
public class TYEmployeeAction {

	@Autowired
	private TYEmployeeBiz biz;
	
	//查询
	@GetMapping("b/{name}/{p}/{s}")
	public PageInfo<VO> getVO(@PathVariable String name,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryVO(name, p, s);
	}
	
}
