package com.accp.pojo.ct;

import java.util.Date;
import java.util.List;

/**
 * 车资料
 */
public class Vehicle {
    //车编号
    private Integer vid;
    //客户编号
    private String clientid;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    //车牌号
    private String license;
    //车辆品牌
    private String vehiclebrand;
    //车辆型号
    private String model;
    //驾驶员
    private String driver;
    //驾驶员电话
    private String driverphone;
    //车辆归属
    private String vehicleownership;
    //车架号
    private String vin;
    //发动机
    private String engine;
    //发动机品牌
    private String enginebrand;
    //车辆年款
    private Date vehiclemodel;
    //里程
    private String mileage;
    //载重
    private Integer load;
    //车系
    private String carseries;
    //购买日期
    private Date buydate;
    //上牌日期
    private Date registereddate;
    //车检到期
    private Date citydue;
    //燃油类型
    private String fueltype;
    //会员码
    private String member;

    //一个用户对应车（一对多）
    private List<Client> client;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vid='" + vid + '\'' +
                ", clientid='" + clientid + '\'' +
                ", license='" + license + '\'' +
                ", vehiclebrand='" + vehiclebrand + '\'' +
                ", model='" + model + '\'' +
                ", driver='" + driver + '\'' +
                ", driverphone='" + driverphone + '\'' +
                ", vehicleownership='" + vehicleownership + '\'' +
                ", vin='" + vin + '\'' +
                ", engine='" + engine + '\'' +
                ", enginebrand='" + enginebrand + '\'' +
                ", vehiclemodel=" + vehiclemodel +
                ", mileage='" + mileage + '\'' +
                ", load=" + load +
                ", carseries='" + carseries + '\'' +
                ", buydate=" + buydate +
                ", registereddate=" + registereddate +
                ", citydue=" + citydue +
                ", fueltype='" + fueltype + '\'' +
                ", member='" + member + '\'' +
                ", client=" + client +
                '}';
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public Vehicle() {}

    public Vehicle(Integer vid, String clientid, String license, String vehiclebrand, String model, String driver, String driverphone, String vehicleownership, String vin, String engine, String enginebrand, Date vehiclemodel, String mileage, Integer load, String carseries, Date buydate, Date registereddate, Date citydue, String fueltype, String member, List<Client> client) {
        this.vid = vid;
        this.clientid = clientid;
        this.license = license;
        this.vehiclebrand = vehiclebrand;
        this.model = model;
        this.driver = driver;
        this.driverphone = driverphone;
        this.vehicleownership = vehicleownership;
        this.vin = vin;
        this.engine = engine;
        this.enginebrand = enginebrand;
        this.vehiclemodel = vehiclemodel;
        this.mileage = mileage;
        this.load = load;
        this.carseries = carseries;
        this.buydate = buydate;
        this.registereddate = registereddate;
        this.citydue = citydue;
        this.fueltype = fueltype;
        this.member = member;
        this.client = client;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getVehiclebrand() {
        return vehiclebrand;
    }

    public void setVehiclebrand(String vehiclebrand) {
        this.vehiclebrand = vehiclebrand == null ? null : vehiclebrand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getVehicleownership() {
        return vehicleownership;
    }

    public void setVehicleownership(String vehicleownership) {
        this.vehicleownership = vehicleownership == null ? null : vehicleownership.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getEnginebrand() {
        return enginebrand;
    }

    public void setEnginebrand(String enginebrand) {
        this.enginebrand = enginebrand == null ? null : enginebrand.trim();
    }

    public Date getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(Date vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    public String getCarseries() {
        return carseries;
    }

    public void setCarseries(String carseries) {
        this.carseries = carseries == null ? null : carseries.trim();
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Date getRegistereddate() {
        return registereddate;
    }

    public void setRegistereddate(Date registereddate) {
        this.registereddate = registereddate;
    }

    public Date getCitydue() {
        return citydue;
    }

    public void setCitydue(Date citydue) {
        this.citydue = citydue;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }
}