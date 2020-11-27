package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 		班组技工
 * @author 团子等等俺
 *
 */
public class shiftthemechanic {
    private Integer mid;//班组编号

    private String mname;//班组名称

    private String aid;//技工编号

    private String aname;//技工姓名

    private String asex;//性别

    private String aphone;//手机

    private String aaddress;//地址

    private Date abrondate;//出生日期

    private Boolean isgroupleader;//组长

    private String loginaccount;//登录账号

    private String wechataccount;//微信号

    private String idcard;//身份证号

    private String residence;//户口地址

    private String depositbank;//开户银行

    private Integer starlevel;//星级

    private String maintenanceandrepairwork;//维修工种

    private String brandmaintain;//维系品牌

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex == null ? null : asex.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAaddress() {
        return aaddress;
    }

    public void setAaddress(String aaddress) {
        this.aaddress = aaddress == null ? null : aaddress.trim();
    }

    public Date getAbrondate() {
        return abrondate;
    }

    public void setAbrondate(Date abrondate) {
        this.abrondate = abrondate;
    }

    public Boolean getIsgroupleader() {
        return isgroupleader;
    }

    public void setIsgroupleader(Boolean isgroupleader) {
        this.isgroupleader = isgroupleader;
    }

    public String getLoginaccount() {
        return loginaccount;
    }

    public void setLoginaccount(String loginaccount) {
        this.loginaccount = loginaccount == null ? null : loginaccount.trim();
    }

    public String getWechataccount() {
        return wechataccount;
    }

    public void setWechataccount(String wechataccount) {
        this.wechataccount = wechataccount == null ? null : wechataccount.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getDepositbank() {
        return depositbank;
    }

    public void setDepositbank(String depositbank) {
        this.depositbank = depositbank == null ? null : depositbank.trim();
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
        this.maintenanceandrepairwork = maintenanceandrepairwork == null ? null : maintenanceandrepairwork.trim();
    }

    public String getBrandmaintain() {
        return brandmaintain;
    }

    public void setBrandmaintain(String brandmaintain) {
        this.brandmaintain = brandmaintain == null ? null : brandmaintain.trim();
    }
    
    public shiftthemechanic() {}
    
	public shiftthemechanic(Integer mid, String mname, String aid, String aname, String asex, String aphone,
			String aaddress, Date abrondate, Boolean isgroupleader, String loginaccount, String wechataccount,
			String idcard, String residence, String depositbank, Integer starlevel, String maintenanceandrepairwork,
			String brandmaintain) {
		super();
		this.mid = mid;
		this.mname = mname;
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
	}

	@Override
	public String toString() {
		return "shiftthemechanic [mid=" + mid + ", mname=" + mname + ", aid=" + aid + ", aname=" + aname + ", asex="
				+ asex + ", aphone=" + aphone + ", aaddress=" + aaddress + ", abrondate=" + abrondate
				+ ", isgroupleader=" + isgroupleader + ", loginaccount=" + loginaccount + ", wechataccount="
				+ wechataccount + ", idcard=" + idcard + ", residence=" + residence + ", depositbank=" + depositbank
				+ ", starlevel=" + starlevel + ", maintenanceandrepairwork=" + maintenanceandrepairwork
				+ ", brandmaintain=" + brandmaintain + "]";
	}
    
    
}