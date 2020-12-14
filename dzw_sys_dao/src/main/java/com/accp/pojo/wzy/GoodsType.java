package com.accp.pojo.wzy;

import java.util.ArrayList;
import java.util.List;

public class GoodsType {
	private Integer gid;
	private String gname;
	private Integer fatherType;
	
	private List<SmallRepair> smallrepair=new ArrayList<SmallRepair>();
	
	public List<SmallRepair> getGoods() {
		return smallrepair;
	}
	public void setGoods(List<SmallRepair> smallrepair) {
		this.smallrepair = smallrepair;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getFatherType() {
		return fatherType;
	}
	public void setFatherType(Integer fatherType) {
		this.fatherType = fatherType;
	}
	
}
