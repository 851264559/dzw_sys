package com.accp.pojo.cwl;
/**
 * 	外勤车辆
 * @author 团子等等俺
 *
 */
public class FieldOfVehicle {
    private String carnumber;//车牌号

    private String brand;//品牌

    private String cartype;//车型

    private Float timeintothefactory;//进厂时间

    private String ownershipshift;//归属班组

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Float getTimeintothefactory() {
        return timeintothefactory;
    }

    public void setTimeintothefactory(Float timeintothefactory) {
        this.timeintothefactory = timeintothefactory;
    }

    public String getOwnershipshift() {
        return ownershipshift;
    }

    public void setOwnershipshift(String ownershipshift) {
        this.ownershipshift = ownershipshift == null ? null : ownershipshift.trim();
    }
}