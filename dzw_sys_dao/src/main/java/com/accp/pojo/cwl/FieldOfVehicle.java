package com.accp.pojo.cwl;
/**
 * 	���ڳ���
 * @author ���ӵȵȰ�
 *
 */
public class FieldOfVehicle {
    private String carnumber;//���ƺ�

    private String brand;//Ʒ��

    private String cartype;//����

    private Float timeintothefactory;//����ʱ��

    private String ownershipshift;//��������

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