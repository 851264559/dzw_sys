package com.accp.pojo.ty;

public class Postb {
	/**
	 * 职务表
	 */
	private int zid; 
	private String zname;//职务名称
	
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	@Override
	public String toString() {
		return "Postb [zid=" + zid + ", zname=" + zname + "]";
	}
	public Postb(int zid, String zname) {
		super();
		this.zid = zid;
		this.zname = zname;
	}
	public Postb() {
		super();
	}
}
