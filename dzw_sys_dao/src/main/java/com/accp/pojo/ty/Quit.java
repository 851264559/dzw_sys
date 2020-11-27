package com.accp.pojo.ty;

public class Quit {
	/**
	 * 离职状态表
	 * 1离职
	 * 2工作中
	 */
	private int lzid; 
	private String lzname;//离职属性
	
	public int getLzid() {
		return lzid;
	}
	public void setLzid(int lzid) {
		this.lzid = lzid;
	}
	public String getLzname() {
		return lzname;
	}
	public void setLzname(String lzname) {
		this.lzname = lzname;
	}
	@Override
	public String toString() {
		return "Quit [lzid=" + lzid + ", lzname=" + lzname + "]";
	}
	public Quit(int lzid, String lzname) {
		super();
		this.lzid = lzid;
		this.lzname = lzname;
	}
	public Quit() {
		super();
	}
}
