package com.accp.pojo.cwl;
/**
 * 	维修项目
 * @author 团子等等俺
 *
 */
public class maintenanceitems {
    private String oid;//项目编号

    private String oname;//项目名称

    private Float number;//数量

    private String priceclass;//价类

    private Float unitprice;//单价

    private Float money;//金额

    private Float settlementprice;//技师结算价

    private String errordesc;//故障描述

    private String errorcause;//故障原因

    private String themaintenancecrew;//维修班组

    private String busyworkgroup;//作业人员

    private String server;//服务顾问

    private String workordernumber;//工单号

    private String freeofchargefor;//免单原因

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getPriceclass() {
        return priceclass;
    }

    public void setPriceclass(String priceclass) {
        this.priceclass = priceclass == null ? null : priceclass.trim();
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getSettlementprice() {
        return settlementprice;
    }

    public void setSettlementprice(Float settlementprice) {
        this.settlementprice = settlementprice;
    }

    public String getErrordesc() {
        return errordesc;
    }

    public void setErrordesc(String errordesc) {
        this.errordesc = errordesc == null ? null : errordesc.trim();
    }

    public String getErrorcause() {
        return errorcause;
    }

    public void setErrorcause(String errorcause) {
        this.errorcause = errorcause == null ? null : errorcause.trim();
    }

    public String getThemaintenancecrew() {
        return themaintenancecrew;
    }

    public void setThemaintenancecrew(String themaintenancecrew) {
        this.themaintenancecrew = themaintenancecrew == null ? null : themaintenancecrew.trim();
    }

    public String getBusyworkgroup() {
        return busyworkgroup;
    }

    public void setBusyworkgroup(String busyworkgroup) {
        this.busyworkgroup = busyworkgroup == null ? null : busyworkgroup.trim();
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public String getWorkordernumber() {
        return workordernumber;
    }

    public void setWorkordernumber(String workordernumber) {
        this.workordernumber = workordernumber == null ? null : workordernumber.trim();
    }

    public String getFreeofchargefor() {
        return freeofchargefor;
    }

    public void setFreeofchargefor(String freeofchargefor) {
        this.freeofchargefor = freeofchargefor == null ? null : freeofchargefor.trim();
    }
}