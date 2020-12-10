package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 		班组技工
 * @author 
 *
 */
public class shiftthemechanic {
    private String aid;//技工编号

    private String aname;//技工姓名

    private int asex;//性别

    private String aphone;//手机

    private String aaddress;//地址

    private Date abrondate;//出生日期

    private int isgroupleader;//组长

    private String loginaccount;//登录账号

    private String wechataccount;//微信号

    private String idcard;//身份证号

    private String residence;//户口地址

    private String depositbank;//开户银行

    private Integer starlevel;//星级

    private String maintenanceandrepairwork;//维修工种

    private String brandmaintain;//维系品牌
    
    private Integer steam;//班组id

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}


	public int getAsex() {
		return asex;
	}

	public void setAsex(int asex) {
		this.asex = asex;
	}

	public String getAphone() {
		return aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public String getAaddress() {
		return aaddress;
	}

	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}

	public Date getAbrondate() {
		return abrondate;
	}

	public void setAbrondate(Date abrondate) {
		this.abrondate = abrondate;
	}

	public int getIsgroupleader() {
		return isgroupleader;
	}

	public void setIsgroupleader(int isgroupleader) {
		this.isgroupleader = isgroupleader;
	}

	public String getLoginaccount() {
		return loginaccount;
	}

	public void setLoginaccount(String loginaccount) {
		this.loginaccount = loginaccount;
	}

	public String getWechataccount() {
		return wechataccount;
	}

	public void setWechataccount(String wechataccount) {
		this.wechataccount = wechataccount;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getDepositbank() {
		return depositbank;
	}

	public void setDepositbank(String depositbank) {
		this.depositbank = depositbank;
	}

	public Integer getStarlevel() {
		return starlevel;
	}

	public void setStarlevel(Integer starlevel) {
		this.starlevel = starlevel;
	}

	public String getMaintenanceandrepairwork() {
		return maintenanceandrepairwork;
	}

	public void setMaintenanceandrepairwork(String maintenanceandrepairwork) {
		this.maintenanceandrepairwork = maintenanceandrepairwork;
	}

	public String getBrandmaintain() {
		return brandmaintain;
	}

	public void setBrandmaintain(String brandmaintain) {
		this.brandmaintain = brandmaintain;
	}

	public Integer getSteam() {
		return steam;
	}

	public void setSteam(Integer steam) {
		this.steam = steam;
	}

	
	public shiftthemechanic(String aid, String aname, int asex, String aphone, String aaddress, Date abrondate,
			int isgroupleader, String loginaccount, String wechataccount, String idcard, String residence,
			String depositbank, Integer starlevel, String maintenanceandrepairwork, String brandmaintain,
			Integer steam) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.asex = asex;
		this.aphone = aphone;
		this.aaddress = aaddress;
		this.abrondate = abrondate;
		this.isgroupleader = isgroupleader;
		this.loginaccount = loginaccount;
		this.wechataccount = wechataccount;
		this.idcard = idcard;
		this.residence = residence;
		this.depositbank = depositbank;
		this.starlevel = starlevel;
		this.maintenanceandrepairwork = maintenanceandrepairwork;
		this.brandmaintain = brandmaintain;
		this.steam = steam;
	}

	@Override
	public String toString() {
		return "shiftthemechanic [aid=" + aid + ", aname=" + aname + ", asex=" + asex + ", aphone=" + aphone
				+ ", aaddress=" + aaddress + ", abrondate=" + abrondate + ", isgroupleader=" + isgroupleader
				+ ", loginaccount=" + loginaccount + ", wechataccount=" + wechataccount + ", idcard=" + idcard
				+ ", residence=" + residence + ", depositbank=" + depositbank + ", starlevel=" + starlevel
				+ ", maintenanceandrepairwork=" + maintenanceandrepairwork + ", brandmaintain=" + brandmaintain
				+ ", steam=" + steam + "]";
	}

	public shiftthemechanic() {
		super();
	}
    
    
}