package com.accp.pojo.wzy;

public class SmallRepair {
	
	private Integer sid;//类别id
	private Integer gid;//父类别id
	private String  sname;//维修的类别
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
