package com.accp.action.ty;
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
import com.accp.biz.ty.TYEmployeeBiz;
import com.accp.biz.ty.TYMentBiz;
import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.Postb;
import com.accp.pojo.ty.VO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/ty/api/employee")
public class TYEmployeeAction {

	@Autowired
	private TYEmployeeBiz biz;
	
	//通讯名录查询
	@GetMapping("b/{name}/{p}/{s}")
	public PageInfo<VO> getVO(@PathVariable String name,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryVO(name, p, s);
	}
	
	//组织机构查询
	@GetMapping("z/{bid}/{p}/{s}")
	public PageInfo<VO> getVoAll(@PathVariable Integer bid,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryVoAll(bid, p, s);
	}
	
	//部门下拉框绑定
	@GetMapping("ww")
	public List<Ment> getEdoVoInfo() {
		return biz.queryMent();
	}
	
	//职位下拉框绑定
	@GetMapping("zw")
	public List<Postb> getPostb() {
		return biz.queryPostb();
	}
	
	//新增
	@PostMapping("employee")
	public Map<String, String> addEmployeeInfo(@RequestBody Employee employee) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addEmployee(employee);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改页面详情
	@GetMapping("cc/{yid}")
	public Employee getEdocentry(@PathVariable Integer yid) {
		return biz.getEmployee(yid);
	}
	
	@DeleteMapping("hhh/{yid}")
	public Map<String, String> delyidInfo(@PathVariable Integer yid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.removeyid(yid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
}
