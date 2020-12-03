package com.accp.action.cyj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cyj.PermBiz;
import com.accp.pojo.cyj.Perm;

@RestController
@RequestMapping("/api/Perms")
public class PermAction {

	@Autowired
	private PermBiz permBiz;

	/**
	 * 保存权限
	 * @param rid
	 * @param fid
	 * @param empName
	 * @return
	 */
	@PostMapping("Perm")
	public Map<String, String> savePerm(@RequestBody Perm perm) {
		permBiz.addPerm(perm.getRid(), perm.getFidList(), perm.getCreateby());
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("code", "200");
		resultMap.put("msg", "成功！");
		return resultMap;
	}
	
}
