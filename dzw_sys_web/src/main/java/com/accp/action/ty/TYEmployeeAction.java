package com.accp.action.ty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.biz.ty.TYEmployeeBiz;
import com.accp.biz.ty.TYMentBiz;
import com.accp.pojo.cyj.Function;
import com.accp.pojo.ty.Employee;
import com.accp.pojo.ty.Ment;
import com.accp.pojo.ty.VO;
import com.github.pagehelper.PageInfo;

@SuppressWarnings("all")
@RestController
@RequestMapping("/ty/api/employee")
public class TYEmployeeAction {

	@Autowired
	private TYEmployeeBiz biz;
	
	
	@GetMapping("b/{name}/{p}/{s}")
	public PageInfo<VO> getVO(@PathVariable String name,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryVO(name, p, s);
	}
	
	/**
	 * 组织机构查询
	 * @param bid
	 * @param p
	 * @param s
	 * @return
	 */
	@GetMapping("z/{bid}/{p}/{s}")
	public PageInfo<VO> getVoAll(@PathVariable Integer bid,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.queryVoAll(bid, p, s);
	}
	
	/**
	 * 登录
	 */
	@GetMapping("login/{yaccount}/{ypwd}")
	public Map<String, Object> login(@PathVariable String yaccount,@PathVariable String ypwd,HttpSession session) {
		Employee emp = biz.login(yaccount, ypwd);
		Map<String, Object> message = new HashMap<String, Object>();
		if (emp != null) {
			session.setAttribute("EMPLOYEE", emp);// 服务器保存
			message.put("code", "200");
			message.put("msg", "ok");
			message.put("employee", emp);// 客户端保存
		} else {
			message.put("code", "300");
			message.put("msg", "login_error");
		}
		return message;
	}
	
	@GetMapping("getFunTree")
	public List getEmpFunTree(HttpSession session){
		Employee emp = (Employee) session.getAttribute("EMPLOYEE");
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Function fun : emp.getPostb().getFunctions()) {
			menuNames.add(fun.getParentFun().getFname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);// 0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Function fun : emp.getPostb().getFunctions()) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getParentFun().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFcode());
					n.put("text", fun.getFname());
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}
}
