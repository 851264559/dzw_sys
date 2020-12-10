package com.accp.action.cwl;
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
import com.accp.biz.cwl.BzjgBiz;
import com.accp.pojo.cwl.Team;
import com.accp.pojo.cwl.bzjgVO;
import com.accp.pojo.cwl.shiftthemechanic;
import com.accp.pojo.cwl.staremployees;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/dzw_Sys/cwl/team")
public class BzjgAction {
	
	@Autowired
	private BzjgBiz biz;
	
	//查询班组
	@GetMapping("bzcx")
	public List<Team> getTeam() {
		return biz.queryTeam();
	}
	
	//新增班组
	@PostMapping("bzxz")
	public Map<String, String> addTeam(@RequestBody Team team) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addTeam(team);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//删除班组
	@DeleteMapping("bzsc/{teid}")
	public Map<String, String> delteid(@PathVariable Integer teid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.removeteid(teid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改班组
	@PutMapping("bzxg/team")
	public Map<String, String> updateMentInfo(@RequestBody Team team) {
		Map<String, String> message = new HashMap<String, String>();
		biz.modifyTeam(team);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//班组技工查询
	@GetMapping("bzjg/{steam}/{p}/{s}")
	public PageInfo<bzjgVO> getBzjg(@PathVariable Integer steam,@PathVariable Integer p, @PathVariable Integer s) {
		return biz.querybzjgVo(steam, p, s);
	}
	
	//班组下拉框绑定
	@GetMapping("bzbd")
	public List<Team> getTeamInfo() {
		return biz.queryTeam();
	}
	
	//班组下拉框绑定
	@GetMapping("bzxj")
	public List<staremployees> getStarInfo() {
		return biz.queryStar();
	}
	
	//新增技工
	@PostMapping("shiftthemechanic")
	public Map<String, String> addshiftthemechanicInfo(@RequestBody shiftthemechanic shiftthemechanic) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addShiftthemechanic(shiftthemechanic);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//技工删除
	@DeleteMapping("jgsc/{aid}")
	public Map<String, String> delaidInfo(@PathVariable Integer aid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.removeaid(aid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//判断该班组部门是否有人
	@GetMapping("bz/{steam}")
	public int getBz(@PathVariable Integer steam) {
		return biz.queryBz(steam);
	}
	
}
