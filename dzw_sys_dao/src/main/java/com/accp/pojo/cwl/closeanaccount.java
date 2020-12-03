package com.accp.pojo.cwl;

import java.util.Date;

public class closeanaccount {
    private Integer id;//id

    private String saleno;//���۵���

    private String receiptstype;//��������

    private String clearing;//���㷽ʽ

    private Float clearingmoney;//������

    private String principal;//������

    private String license;//���ƺ�

    private String customername;//�ͻ�����

    private String frameno;//���ܺ�

    private String vehiclemodel;//����

    private Date timeofcompletion;//�깤ʱ��

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno == null ? null : saleno.trim();
    }

    public String getReceiptstype() {
        return receiptstype;
    }

    public void setReceiptstype(String receiptstype) {
        this.receiptstype = receiptstype == null ? null : receiptstype.trim();
    }

    public String getClearing() {
        return clearing;
    }

    public void setClearing(String clearing) {
        this.clearing = clearing == null ? null : clearing.trim();
    }

    public Float getClearingmoney() {
        return clearingmoney;
    }

    public void setClearingmoney(Float clearingmoney) {
        this.clearingmoney = clearingmoney;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getFrameno() {
        return frameno;
    }

    public void setFrameno(String frameno) {
        this.frameno = frameno == null ? null : frameno.trim();
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel == null ? null : vehiclemodel.trim();
    }

    public Date getTimeofcompletion() {
        return timeofcompletion;
    }

    public void setTimeofcompletion(Date timeofcompletion) {
        this.timeofcompletion = timeofcompletion;
    }
    
    public closeanaccount() {}
    
	public closeanaccount(Integer id, String saleno, String receiptstype, String clearing, Float clearingmoney,
			String principal, String license, String customername, String frameno, String vehiclemodel,
			Date timeofcompletion) {
		super();
		this.id = id;
		this.saleno = saleno;
		this.receiptstype = receiptstype;
		this.clearing = clearing;
		this.clearingmoney = clearingmoney;
		this.principal = principal;
		this.license = license;
		this.customername = customername;
		this.frameno = frameno;
		this.vehiclemodel = vehiclemodel;
		this.timeofcompletion = timeofcompletion;
	}

	@Override
	public String toString() {
		return "closeanaccount [id=" + id + ", saleno=" + saleno + ", receiptstype=" + receiptstype + ", clearing="
				+ clearing + ", clearingmoney=" + clearingmoney + ", principal=" + principal + ", license=" + license
				+ ", customername=" + customername + ", frameno=" + frameno + ", vehiclemodel=" + vehiclemodel
				+ ", timeofcompletion=" + timeofcompletion + "]";
	}
    
    
}