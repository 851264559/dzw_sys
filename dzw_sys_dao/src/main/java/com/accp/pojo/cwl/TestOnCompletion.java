package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 		竣工检验
 * @author 团子等等俺
 *
 */
public class TestOnCompletion {
    private String repairorder;//维修单号

    private String typeofdocument;//单据类型

    private String businesstype;//业务类型

    private String constructiondivisions;//施工班次

    private String ownername;//车主姓名

    private String licenseplatenumber;//车牌号

    private String cartype;//车型

    private String vin;//车架号

    private Date pickupcartime;//接车时间

    private Date expectedcompletion;//预计完工

    private Date timeofcompletion;//完工时间

    private String delaysreason;//误工原因

    private Integer numberofrework;//返工数

    private Float penaltyamount;//处罚金额

    private String reworkreason;//返工原因

    private String principal;//负责人

    private String thedocumentsstate;//单据状态

    public String getRepairorder() {
        return repairorder;
    }

    public void setRepairorder(String repairorder) {
        this.repairorder = repairorder == null ? null : repairorder.trim();
    }

    public String getTypeofdocument() {
        return typeofdocument;
    }

    public void setTypeofdocument(String typeofdocument) {
        this.typeofdocument = typeofdocument == null ? null : typeofdocument.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getConstructiondivisions() {
        return constructiondivisions;
    }

    public void setConstructiondivisions(String constructiondivisions) {
        this.constructiondivisions = constructiondivisions == null ? null : constructiondivisions.trim();
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    public String getLicenseplatenumber() {
        return licenseplatenumber;
    }

    public void setLicenseplatenumber(String licenseplatenumber) {
        this.licenseplatenumber = licenseplatenumber == null ? null : licenseplatenumber.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Date getPickupcartime() {
        return pickupcartime;
    }

    public void setPickupcartime(Date pickupcartime) {
        this.pickupcartime = pickupcartime;
    }

    public Date getExpectedcompletion() {
        return expectedcompletion;
    }

    public void setExpectedcompletion(Date expectedcompletion) {
        this.expectedcompletion = expectedcompletion;
    }

    public Date getTimeofcompletion() {
        return timeofcompletion;
    }

    public void setTimeofcompletion(Date timeofcompletion) {
        this.timeofcompletion = timeofcompletion;
    }

    public String getDelaysreason() {
        return delaysreason;
    }

    public void setDelaysreason(String delaysreason) {
        this.delaysreason = delaysreason == null ? null : delaysreason.trim();
    }

    public Integer getNumberofrework() {
        return numberofrework;
    }

    public void setNumberofrework(Integer numberofrework) {
        this.numberofrework = numberofrework;
    }

    public Float getPenaltyamount() {
        return penaltyamount;
    }

    public void setPenaltyamount(Float penaltyamount) {
        this.penaltyamount = penaltyamount;
    }

    public String getReworkreason() {
        return reworkreason;
    }

    public void setReworkreason(String reworkreason) {
        this.reworkreason = reworkreason == null ? null : reworkreason.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getThedocumentsstate() {
        return thedocumentsstate;
    }

    public void setThedocumentsstate(String thedocumentsstate) {
        this.thedocumentsstate = thedocumentsstate == null ? null : thedocumentsstate.trim();
    }
}