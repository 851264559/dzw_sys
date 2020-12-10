package com.accp.pojo.cwl;

public class Team {
	private int teid; 
	private String tename;//°à×éÃû³Æ
	
	public int getTeid() {
		return teid;
	}
	public void setTeid(int teid) {
		this.teid = teid;
	}
	public String getTename() {
		return tename;
	}
	public void setTename(String tename) {
		this.tename = tename;
	}
	
	@Override
	public String toString() {
		return "Team [teid=" + teid + ", tename=" + tename + "]";
	}
	
	public Team(int teid, String tename) {
		super();
		this.teid = teid;
		this.tename = tename;
	}
	
	public Team() {
		super();
	}
}
