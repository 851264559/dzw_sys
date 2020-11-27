package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 	站外救援单
 * @author 团子等等俺
 *
 */
public class OffSiteRescueSheet {
    private String oddnumber;//单号

    private String carnumbers;//车牌号

    private String cartype;//车型

    private String bland;//车辆品牌

    private String enginebrand;//发动机品牌

    private String vin;//车架号

    private String enginenumber;//发动机号

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

    private Date thelasttimeintothefactory;//上次进厂

    private String receptionnote;//接待备注

    private String repairstatement;//维修陈述

    private String rescuetheaddress;//救援地址

    private Date timeofcompletion;//完工时间

    private Float estimatedamount;//预估金额

    private String maintenancenote;//维修备注

    private String rescuestatement;//救援陈述

    public String getOddnumber() {
        return oddnumber;
    }

    public void setOddnumber(String oddnumber) {
        this.oddnumber = oddnumber == null ? null : oddnumber.trim();
    }

    public String getCarnumbers() {
        return carnumbers;
    }

    public void setCarnumbers(String carnumbers) {
        this.carnumbers = carnumbers == null ? null : carnumbers.trim();
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

    public String getEnginebrand() {
        return enginebrand;
    }

    public void setEnginebrand(String enginebrand) {
        this.enginebrand = enginebrand == null ? null : enginebrand.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEnginenumber() {
        return enginenumber;
    }

    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber == null ? null : enginenumber.trim();
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

    public Date getThelasttimeintothefactory() {
        return thelasttimeintothefactory;
    }

    public void setThelasttimeintothefactory(Date thelasttimeintothefactory) {
        this.thelasttimeintothefactory = thelasttimeintothefactory;
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

    public String getRescuetheaddress() {
        return rescuetheaddress;
    }

    public void setRescuetheaddress(String rescuetheaddress) {
        this.rescuetheaddress = rescuetheaddress == null ? null : rescuetheaddress.trim();
    }

    public Date getTimeofcompletion() {
        return timeofcompletion;
    }

    public void setTimeofcompletion(Date timeofcompletion) {
        this.timeofcompletion = timeofcompletion;
    }

    public Float getEstimatedamount() {
        return estimatedamount;
    }

    public void setEstimatedamount(Float estimatedamount) {
        this.estimatedamount = estimatedamount;
    }

    public String getMaintenancenote() {
        return maintenancenote;
    }

    public void setMaintenancenote(String maintenancenote) {
        this.maintenancenote = maintenancenote == null ? null : maintenancenote.trim();
    }

    public String getRescuestatement() {
        return rescuestatement;
    }

    public void setRescuestatement(String rescuestatement) {
        this.rescuestatement = rescuestatement == null ? null : rescuestatement.trim();
    }
    
    public OffSiteRescueSheet() {}
    
	public OffSiteRescueSheet(String oddnumber, String carnumbers, String cartype, String bland, String enginebrand,
			String vin, String enginenumber, String server, String carownname, String driver, String phone,
			Float milesintothefactory, Float oilintothefactory, Float thelasttimethemileage, Float timeintothefactory,
			String classofbusiness, String constructiondivisions, String pickone, Date expectedcompletion,
			String clearingform, String indemnitycompany, Date thelasttimeintothefactory, String receptionnote,
			String repairstatement, String rescuetheaddress, Date timeofcompletion, Float estimatedamount,
			String maintenancenote, String rescuestatement) {
		super();
		this.oddnumber = oddnumber;
		this.carnumbers = carnumbers;
		this.cartype = cartype;
		this.bland = bland;
		this.enginebrand = enginebrand;
		this.vin = vin;
		this.enginenumber = enginenumber;
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
		this.thelasttimeintothefactory = thelasttimeintothefactory;
		this.receptionnote = receptionnote;
		this.repairstatement = repairstatement;
		this.rescuetheaddress = rescuetheaddress;
		this.timeofcompletion = timeofcompletion;
		this.estimatedamount = estimatedamount;
		this.maintenancenote = maintenancenote;
		this.rescuestatement = rescuestatement;
	}

	@Override
	public String toString() {
		return "OffSiteRescueSheet [oddnumber=" + oddnumber + ", carnumbers=" + carnumbers + ", cartype=" + cartype
				+ ", bland=" + bland + ", enginebrand=" + enginebrand + ", vin=" + vin + ", enginenumber="
				+ enginenumber + ", server=" + server + ", carownname=" + carownname + ", driver=" + driver + ", phone="
				+ phone + ", milesintothefactory=" + milesintothefactory + ", oilintothefactory=" + oilintothefactory
				+ ", thelasttimethemileage=" + thelasttimethemileage + ", timeintothefactory=" + timeintothefactory
				+ ", classofbusiness=" + classofbusiness + ", constructiondivisions=" + constructiondivisions
				+ ", pickone=" + pickone + ", expectedcompletion=" + expectedcompletion + ", clearingform="
				+ clearingform + ", indemnitycompany=" + indemnitycompany + ", thelasttimeintothefactory="
				+ thelasttimeintothefactory + ", receptionnote=" + receptionnote + ", repairstatement="
				+ repairstatement + ", rescuetheaddress=" + rescuetheaddress + ", timeofcompletion=" + timeofcompletion
				+ ", estimatedamount=" + estimatedamount + ", maintenancenote=" + maintenancenote + ", rescuestatement="
				+ rescuestatement + "]";
	}
    
    
}