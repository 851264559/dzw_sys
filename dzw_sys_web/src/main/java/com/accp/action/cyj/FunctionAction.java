package com.accp.action.cyj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cyj.FunctionBiz;
import com.accp.pojo.cyj.Function;

@SuppressWarnings("all")
@RestController
@RequestMapping("/api/Functions")
public class FunctionAction {

	@Autowired
	private FunctionBiz functionBiz;
	
	@GetMapping
	public List getFunctions() {
		List<Function> functions = functionBiz.findFunctionAll();
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Function fun : functions) {
			menuNames.add(fun.getParentFun().getFname());
		}
		int i=0;
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", i++);// 0:根级菜单
			node.put("label", name);
			List nodeChild = new ArrayList();
			for (Function fun :functions) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getParentFun().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFid());
					n.put("label", fun.getFname());
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}
	@GetMapping("{zid}")
	public List<Integer> getFunctionsById(@PathVariable Integer zid) {
		return functionBiz.findFunctionId(zid);
	}
}
