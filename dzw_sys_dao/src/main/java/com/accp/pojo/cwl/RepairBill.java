package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 	维修单
 * @author 团子等等俺
 *
 */
public class RepairBill {
    private String roddnumber;//单号

    private String carnumbers;//车牌号

    private String vin;//车架号

    private String cartype;//车型

    private String bland;//车辆品牌

    private String enginenumber;//发动机号

    private String enginebrand;//发动机品牌

    private String server;//服务顾问

    private String carownname;//车主名称

    private String driver;//驾驶员

    private String phone;//联系电话

    private Float milesintothefactory;//进厂里程

    private Float oilintothefactory;//进厂油量

    private Float thelasttimethemileage;//上次里程

    private Float timeintothefactory;//进厂时间

    private String classofbusiness;//业务类别

    private String constructiondivisions;//施工班次

    private String pickone;//接车人

    private Date expectedcompletion;//预计完工

    private String clearingform;//结算方式

    private String indemnitycompany;//赔款公司

    private Date timeofcompletion;//完工时间

    private Date thelasttimeintothefactory;//上次进厂

    private Float estimatedamount;//预估金额

    private String receptionnote;//接待备注

    private String repairstatement;//维修陈述

    public String getRoddnumber() {
        return roddnumber;
    }

    public void setRoddnumber(String roddnumber) {
        this.roddnumber = roddnumber == null ? null : roddnumber.trim();
    }

    public String getCarnumbers() {
        return carnumbers;
    }

    public void setCarnumbers(String carnumbers) {
        this.carnumbers = carnumbers == null ? null : carnumbers.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland == null ? null : bland.trim();
    }

    public String getEnginenumber() {
        return enginenumber;
    }

    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber == null ? null : enginenumber.trim();
    }

    public String getEnginebrand() {
        return enginebrand;
    }

    public void setEnginebrand(String enginebrand) {
        this.enginebrand = enginebrand == null ? null : enginebrand.trim();
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public String getCarownname() {
        return carownname;
    }

    public void setCarownname(String carownname) {
        this.carownname = carownname == null ? null : carownname.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Float getMilesintothefactory() {
        return milesintothefactory;
    }

    public void setMilesintothefactory(Float milesintothefactory) {
        this.milesintothefactory = milesintothefactory;
    }

    public Float getOilintothefactory() {
        return oilintothefactory;
    }

    public void setOilintothefactory(Float oilintothefactory) {
        this.oilintothefactory = oilintothefactory;
    }

    public Float getThelasttimethemileage() {
        return thelasttimethemileage;
    }

    public void setThelasttimethemileage(Float thelasttimethemileage) {
        this.thelasttimethemileage = thelasttimethemileage;
    }

    public Float getTimeintothefactory() {
        return timeintothefactory;
    }

    public void setTimeintothefactory(Float timeintothefactory) {
        this.timeintothefactory = timeintothefactory;
    }

    public String getClassofbusiness() {
        return classofbusiness;
    }

    public void setClassofbusiness(String classofbusiness) {
        this.classofbusiness = classofbusiness == null ? null : classofbusiness.trim();
    }

    public String getConstructiondivisions() {
        return constructiondivisions;
    }

    public void setConstructiondivisions(String constructiondivisions) {
        this.constructiondivisions = constructiondivisions == null ? null : constructiondivisions.trim();
    }

    public String getPickone() {
        return pickone;
    }

    public void setPickone(String pickone) {
        this.pickone = pickone == null ? null : pickone.trim();
    }

    public Date getExpectedcompletion() {
        return expectedcompletion;
    }

    public void setExpectedcompletion(Date expectedcompletion) {
        this.expectedcompletion = expectedcompletion;
    }

    public String getClearingform() {
        return clearingform;
    }

    public void setClearingform(String clearingform) {
        this.clearingform = clearingform == null ? null : clearingform.trim();
    }

    public String getIndemnitycompany() {
        return indemnitycompany;
    }

    public void setIndemnitycompany(String indemnitycompany) {
        this.indemnitycompany = indemnitycompany == null ? null : indemnitycompany.trim();
    }

    public Date getTimeofcompletion() {
        return timeofcompletion;
    }

    public void setTimeofcompletion(Date timeofcompletion) {
        this.timeofcompletion = timeofcompletion;
    }

    public Date getThelasttimeintothefactory() {
        return thelasttimeintothefactory;
    }

    public void setThelasttimeintothefactory(Date thelasttimeintothefactory) {
        this.thelasttimeintothefactory = thelasttimeintothefactory;
    }

    public Float getEstimatedamount() {
        return estimatedamount;
    }

    public void setEstimatedamount(Float estimatedamount) {
        this.estimatedamount = estimatedamount;
    }

    public String getReceptionnote() {
        return receptionnote;
    }

    public void setReceptionnote(String receptionnote) {
        this.receptionnote = receptionnote == null ? null : receptionnote.trim();
    }

    public String getRepairstatement() {
        return repairstatement;
    }

    public void setRepairstatement(String repairstatement) {
        this.repairstatement = repairstatement == null ? null : repairstatement.trim();
    }
    
    public RepairBill() {}
    
	public RepairBill(String roddnumber, String carnumbers, String vin, String cartype, String bland,
			String enginenumber, String enginebrand, String server, String carownname, String driver, String phone,
			Float milesintothefactory, Float oilintothefactory, Float thelasttimethemileage, Float timeintothefactory,
			String classofbusiness, String constructiondivisions, String pickone, Date expectedcompletion,
			String clearingform, String indemnitycompany, Date timeofcompletion, Date thelasttimeintothefactory,
			Float estimatedamount, String receptionnote, String repairstatement) {
		super();
		this.roddnumber = roddnumber;
		this.carnumbers = carnumbers;
		this.vin = vin;
		this.cartype = cartype;
		this.bland = bland;
		this.enginenumber = enginenumber;
		this.enginebrand = enginebrand;
		this.server = server;
		this.carownname = carownname;
		this.driver = driver;
		this.phone = phone;
		this.milesintothefactory = milesintothefactory;
		this.oilintothefactory = oilintothefactory;
		this.thelasttimethemileage = thelasttimethemileage;
		this.timeintothefactory = timeintothefactory;
		this.classofbusiness = classofbusiness;
		this.constructiondivisions = constructiondivisions;
		this.pickone = pickone;
		this.expectedcompletion = expectedcompletion;
		this.clearingform = clearingform;
		this.indemnitycompany = indemnitycompany;
		this.timeofcompletion = timeofcompletion;
		this.thelasttimeintothefactory = thelasttimeintothefactory;
		this.estimatedamount = estimatedamount;
		this.receptionnote = receptionnote;
		this.repairstatement = repairstatement;
	}

	@Override
	public String toString() {
		return "RepairBill [roddnumber=" + roddnumber + ", carnumbers=" + carnumbers + ", vin=" + vin + ", cartype="
				+ cartype + ", bland=" + bland + ", enginenumber=" + enginenumber + ", enginebrand=" + enginebrand
				+ ", server=" + server + ", carownname=" + carownname + ", driver=" + driver + ", phone=" + phone
				+ ", milesintothefactory=" + milesintothefactory + ", oilintothefactory=" + oilintothefactory
				+ ", thelasttimethemileage=" + thelasttimethemileage + ", timeintothefactory=" + timeintothefactory
				+ ", classofbusiness=" + classofbusiness + ", constructiondivisions=" + constructiondivisions
				+ ", pickone=" + pickone + ", expectedcompletion=" + expectedcompletion + ", clearingform="
				+ clearingform + ", indemnitycompany=" + indemnitycompany + ", timeofcompletion=" + timeofcompletion
				+ ", thelasttimeintothefactory=" + thelasttimeintothefactory + ", estimatedamount=" + estimatedamount
				+ ", receptionnote=" + receptionnote + ", repairstatement=" + repairstatement + "]";
	}
    
    
}