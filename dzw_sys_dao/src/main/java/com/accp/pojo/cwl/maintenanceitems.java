package com.accp.pojo.cwl;
/**
 * 	ά����Ŀ
 * @author ���ӵȵȰ�
 *
 */
public class maintenanceitems {
    private String oid;//��Ŀ���

    private String oname;//��Ŀ����

    private Float number;//����

    private String priceclass;//����

    private Float unitprice;//����

    private Float money;//���

    private Float settlementprice;//��ʦ�����

    private String errordesc;//��������

    private String errorcause;//����ԭ��

    private String themaintenancecrew;//ά�ް���

    private String busyworkgroup;//��ҵ��Ա

    private String server;//�������

    private String workordernumber;//������

    private String freeofchargefor;//�ⵥԭ��

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