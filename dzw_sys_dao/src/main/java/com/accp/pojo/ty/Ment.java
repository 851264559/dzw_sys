package com.accp.pojo.ty;

public class Ment {
	/**
	 * 部门表
	 */
	private int bid; 
	private String bname;//部门名称
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Ment [bid=" + bid + ", bname=" + bname + "]";
	}
	public Ment(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Ment() {
		super();
	}
}
