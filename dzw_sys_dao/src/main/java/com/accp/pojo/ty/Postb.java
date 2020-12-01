package com.accp.pojo.ty;

import java.util.List;

import com.accp.pojo.cyj.Function;

public class Postb {
	/**
	 * 职务表
	 */
	private int zid; // 职务表自增id
	private String zname;// 职务名称

	private List<Function> functions;// 功能列表

	
	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

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
