package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 		��������
 * @author ���ӵȵȰ�
 *
 */
public class TestOnCompletion {
    private String repairorder;//ά�޵���

    private String typeofdocument;//��������

    private String businesstype;//ҵ������

    private String constructiondivisions;//ʩ�����

    private String ownername;//��������

    private String licenseplatenumber;//���ƺ�

    private String cartype;//����

    private String vin;//���ܺ�

    private Date pickupcartime;//�ӳ�ʱ��

    private Date expectedcompletion;//Ԥ���깤

    private Date timeofcompletion;//�깤ʱ��

    private String delaysreason;//��ԭ��

    private Integer numberofrework;//������

    private Float penaltyamount;//�������

    private String reworkreason;//����ԭ��

    private String principal;//������

    private String thedocumentsstate;//����״̬

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