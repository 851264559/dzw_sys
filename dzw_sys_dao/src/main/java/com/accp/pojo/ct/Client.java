package com.accp.pojo.ct;

import java.util.Date;
import java.util.*;

/**
 * 用户信息
 */
public class Client {
    //客户编号
    private String cid;
    //客户名称
    private String cname;
    //详细地址
    private String detailedaddress;
    //联系人
    private String linkman;
    //手机
    private String phone;
    //用户类别
    private Integer usertype;
    //会员卡号
    private String cardno;
    //入会日期
    private Date admissiondate;
    //会员到期
    private Date expiredate;
    //备注
    private String remark;
    //建档日期
    private Date nowdate;
    //积分
    private Integer integral;
    //订金余额
    private Float earnest;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", detailedaddress='" + detailedaddress + '\'' +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                ", usertype=" + usertype +
                ", cardno='" + cardno + '\'' +
                ", admissiondate=" + admissiondate +
                ", expiredate=" + expiredate +
                ", remark='" + remark + '\'' +
                ", nowdate=" + nowdate +
                ", integral=" + integral +
                ", earnest=" + earnest +
                ", vehicles=" + vehicles +
                '}';
    }

    //车资料
    private List<Vehicle> vehicles;

    public Client(){}

    public Client(String cid, String cname, String detailedaddress, String linkman, String phone, Integer usertype, String cardno, Date admissiondate, Date expiredate, String remark, Date nowdate, Integer integral, Float earnest) {
        this.cid = cid;
        this.cname = cname;
        this.detailedaddress = detailedaddress;
        this.linkman = linkman;
        this.phone = phone;
        this.usertype = usertype;
        this.cardno = cardno;
        this.admissiondate = admissiondate;
        this.expiredate = expiredate;
        this.remark = remark;
        this.nowdate = nowdate;
        this.integral = integral;
        this.earnest = earnest;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress == null ? null : detailedaddress.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Date getAdmissiondate() {
        return admissiondate;
    }

    public void setAdmissiondate(Date admissiondate) {
        this.admissiondate = admissiondate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getNowdate() {
        return nowdate;
    }

    public void setNowdate(Date nowdate) {
        this.nowdate = nowdate;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Float getEarnest() {
        return earnest;
    }

    public void setEarnest(Float earnest) {
        this.earnest = earnest;
    }
}