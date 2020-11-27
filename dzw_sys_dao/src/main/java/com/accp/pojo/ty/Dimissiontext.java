package com.accp.pojo.ty;

public class Dimissiontext {
	/**
	 * 离职记录表
	 */
	private int lid; 
	private String lreason;//离职原因
	private String ldate;//离职时间
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLreason() {
		return lreason;
	}
	public void setLreason(String lreason) {
		this.lreason = lreason;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
		this.ldate = ldate;
	}
	@Override
	public String toString() {
		return "Dimissiontext [lid=" + lid + ", lreason=" + lreason + ", ldate=" + ldate + "]";
	}
	public Dimissiontext(int lid, String lreason, String ldate) {
		super();
		this.lid = lid;
		this.lreason = lreason;
		this.ldate = ldate;
	}
	public Dimissiontext() {
		super();
	}
}
