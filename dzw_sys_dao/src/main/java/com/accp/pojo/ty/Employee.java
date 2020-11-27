package com.accp.pojo.ty;

public class Employee {
	/**
	 * 员工表
	 */
	  private int yid;
	  private String ynumber;//职工编号
	  private String yname;//职工名称
	  private String yaccount;//职工账号
	  private String ypwd;//职工密码
	  private int ysex;//职工性别
	  private String ybirth;//出生日期
	  private String yphone;//手机号码
	  private String ytel;//联系电话
	  private String yaddress;//联系地址
	  private String yjphone;//紧急人联系电话
	  private String yjname;//紧急人联系姓名
	  private int ymoney;//职工工资
	  private String yrdate;//入职时间
	  private String yjsdate;//试用结束时间
	  private String yhdate;//合同开始时间
	  private String yhjdate;//合同结束时间
	  private int ymentid;//部门id
	  private int ypostid;//职务id
	  private int yquitid;//离职状态id
	  private String ymailbox;//职工邮箱
	  private int yljlid;//离职记录id
	  
	public int getYid() {
		return yid;
	}
	public void setYid(int yid) {
		this.yid = yid;
	}
	public String getYnumber() {
		return ynumber;
	}
	public void setYnumber(String ynumber) {
		this.ynumber = ynumber;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	public String getYaccount() {
		return yaccount;
	}
	public void setYaccount(String yaccount) {
		this.yaccount = yaccount;
	}
	public String getYpwd() {
		return ypwd;
	}
	public void setYpwd(String ypwd) {
		this.ypwd = ypwd;
	}
	public int getYsex() {
		return ysex;
	}
	public void setYsex(int ysex) {
		this.ysex = ysex;
	}
	public String getYbirth() {
		return ybirth;
	}
	public void setYbirth(String ybirth) {
		this.ybirth = ybirth;
	}
	public String getYphone() {
		return yphone;
	}
	public void setYphone(String yphone) {
		this.yphone = yphone;
	}
	public String getYtel() {
		return ytel;
	}
	public void setYtel(String ytel) {
		this.ytel = ytel;
	}
	public String getYaddress() {
		return yaddress;
	}
	public void setYaddress(String yaddress) {
		this.yaddress = yaddress;
	}
	public String getYjphone() {
		return yjphone;
	}
	public void setYjphone(String yjphone) {
		this.yjphone = yjphone;
	}
	public String getYjname() {
		return yjname;
	}
	public void setYjname(String yjname) {
		this.yjname = yjname;
	}
	public int getYmoney() {
		return ymoney;
	}
	public void setYmoney(int ymoney) {
		this.ymoney = ymoney;
	}
	public String getYrdate() {
		return yrdate;
	}
	public void setYrdate(String yrdate) {
		this.yrdate = yrdate;
	}
	public String getYjsdate() {
		return yjsdate;
	}
	public void setYjsdate(String yjsdate) {
		this.yjsdate = yjsdate;
	}
	public String getYhdate() {
		return yhdate;
	}
	public void setYhdate(String yhdate) {
		this.yhdate = yhdate;
	}
	public String getYhjdate() {
		return yhjdate;
	}
	public void setYhjdate(String yhjdate) {
		this.yhjdate = yhjdate;
	}
	public int getYmentid() {
		return ymentid;
	}
	public void setYmentid(int ymentid) {
		this.ymentid = ymentid;
	}
	public int getYpostid() {
		return ypostid;
	}
	public void setYpostid(int ypostid) {
		this.ypostid = ypostid;
	}
	public int getYquitid() {
		return yquitid;
	}
	public void setYquitid(int yquitid) {
		this.yquitid = yquitid;
	}
	public String getYmailbox() {
		return ymailbox;
	}
	public void setYmailbox(String ymailbox) {
		this.ymailbox = ymailbox;
	}
	public int getYljlid() {
		return yljlid;
	}
	public void setYljlid(int yljlid) {
		this.yljlid = yljlid;
	}
	@Override
	public String toString() {
		return "Employee [yid=" + yid + ", ynumber=" + ynumber + ", yname=" + yname + ", yaccount=" + yaccount
				+ ", ypwd=" + ypwd + ", ysex=" + ysex + ", ybirth=" + ybirth + ", yphone=" + yphone + ", ytel=" + ytel
				+ ", yaddress=" + yaddress + ", yjphone=" + yjphone + ", yjname=" + yjname + ", ymoney=" + ymoney
				+ ", yrdate=" + yrdate + ", yjsdate=" + yjsdate + ", yhdate=" + yhdate + ", yhjdate=" + yhjdate
				+ ", ymentid=" + ymentid + ", ypostid=" + ypostid + ", yquitid=" + yquitid + ", ymailbox=" + ymailbox
				+ ", yljlid=" + yljlid + "]";
	}
	public Employee(int yid, String ynumber, String yname, String yaccount, String ypwd, int ysex, String ybirth,
			String yphone, String ytel, String yaddress, String yjphone, String yjname, int ymoney, String yrdate,
			String yjsdate, String yhdate, String yhjdate, int ymentid, int ypostid, int yquitid, String ymailbox,
			int yljlid) {
		super();
		this.yid = yid;
		this.ynumber = ynumber;
		this.yname = yname;
		this.yaccount = yaccount;
		this.ypwd = ypwd;
		this.ysex = ysex;
		this.ybirth = ybirth;
		this.yphone = yphone;
		this.ytel = ytel;
		this.yaddress = yaddress;
		this.yjphone = yjphone;
		this.yjname = yjname;
		this.ymoney = ymoney;
		this.yrdate = yrdate;
		this.yjsdate = yjsdate;
		this.yhdate = yhdate;
		this.yhjdate = yhjdate;
		this.ymentid = ymentid;
		this.ypostid = ypostid;
		this.yquitid = yquitid;
		this.ymailbox = ymailbox;
		this.yljlid = yljlid;
	}
	public Employee() {
		super();
	}
}
