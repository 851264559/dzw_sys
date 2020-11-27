package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 	结算信息
 * @author 团子等等俺
 *
 */
public class BillingInfo {
	
    private String bstatic;//结算状态

    private Float bmoney;//结算金额

    private Float materialsexpenses;//材料费

    private Float costoflabor;//工时费

    private Date bdate;//结算日期

    private String bman;//结算人

    private Float cash;//现金

    private String bankcard;//银行卡

    private String bill;//票据

    private Float paymentoftheamount;//挂账金额

    private String atthecards;//冲储值卡

    private Float atthedeposit;//冲定金

    private Float collecttaxes;//收税金

    private String invoicenumber;//发票号

    private Float internalaccount;//内部帐

    private Float pointsdeduction;//积分抵扣

    private Float toaccountprofitandloss;//到账盈亏

    private String typeofinvoice;//发票种类

    private Float invoicevalue;//发票金额

    private Float vouchers;//抵用卷

    private Float wipethemantissa;//抹尾数

    public String getBstatic() {
        return bstatic;
    }

    public void setBstatic(String bstatic) {
        this.bstatic = bstatic == null ? null : bstatic.trim();
    }

    public Float getBmoney() {
        return bmoney;
    }

    public void setBmoney(Float bmoney) {
        this.bmoney = bmoney;
    }

    public Float getMaterialsexpenses() {
        return materialsexpenses;
    }

    public void setMaterialsexpenses(Float materialsexpenses) {
        this.materialsexpenses = materialsexpenses;
    }

    public Float getCostoflabor() {
        return costoflabor;
    }

    public void setCostoflabor(Float costoflabor) {
        this.costoflabor = costoflabor;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBman() {
        return bman;
    }

    public void setBman(String bman) {
        this.bman = bman == null ? null : bman.trim();
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill == null ? null : bill.trim();
    }

    public Float getPaymentoftheamount() {
        return paymentoftheamount;
    }

    public void setPaymentoftheamount(Float paymentoftheamount) {
        this.paymentoftheamount = paymentoftheamount;
    }

    public String getAtthecards() {
        return atthecards;
    }

    public void setAtthecards(String atthecards) {
        this.atthecards = atthecards == null ? null : atthecards.trim();
    }

    public Float getAtthedeposit() {
        return atthedeposit;
    }

    public void setAtthedeposit(Float atthedeposit) {
        this.atthedeposit = atthedeposit;
    }

    public Float getCollecttaxes() {
        return collecttaxes;
    }

    public void setCollecttaxes(Float collecttaxes) {
        this.collecttaxes = collecttaxes;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public Float getInternalaccount() {
        return internalaccount;
    }

    public void setInternalaccount(Float internalaccount) {
        this.internalaccount = internalaccount;
    }

    public Float getPointsdeduction() {
        return pointsdeduction;
    }

    public void setPointsdeduction(Float pointsdeduction) {
        this.pointsdeduction = pointsdeduction;
    }

    public Float getToaccountprofitandloss() {
        return toaccountprofitandloss;
    }

    public void setToaccountprofitandloss(Float toaccountprofitandloss) {
        this.toaccountprofitandloss = toaccountprofitandloss;
    }

    public String getTypeofinvoice() {
        return typeofinvoice;
    }

    public void setTypeofinvoice(String typeofinvoice) {
        this.typeofinvoice = typeofinvoice == null ? null : typeofinvoice.trim();
    }

    public Float getInvoicevalue() {
        return invoicevalue;
    }

    public void setInvoicevalue(Float invoicevalue) {
        this.invoicevalue = invoicevalue;
    }

    public Float getVouchers() {
        return vouchers;
    }

    public void setVouchers(Float vouchers) {
        this.vouchers = vouchers;
    }

    public Float getWipethemantissa() {
        return wipethemantissa;
    }

    public void setWipethemantissa(Float wipethemantissa) {
        this.wipethemantissa = wipethemantissa;
    }
    
    public BillingInfo() {}
    
	public BillingInfo(String bstatic, Float bmoney, Float materialsexpenses, Float costoflabor, Date bdate,
			String bman, Float cash, String bankcard, String bill, Float paymentoftheamount, String atthecards,
			Float atthedeposit, Float collecttaxes, String invoicenumber, Float internalaccount, Float pointsdeduction,
			Float toaccountprofitandloss, String typeofinvoice, Float invoicevalue, Float vouchers,
			Float wipethemantissa) {
		super();
		this.bstatic = bstatic;
		this.bmoney = bmoney;
		this.materialsexpenses = materialsexpenses;
		this.costoflabor = costoflabor;
		this.bdate = bdate;
		this.bman = bman;
		this.cash = cash;
		this.bankcard = bankcard;
		this.bill = bill;
		this.paymentoftheamount = paymentoftheamount;
		this.atthecards = atthecards;
		this.atthedeposit = atthedeposit;
		this.collecttaxes = collecttaxes;
		this.invoicenumber = invoicenumber;
		this.internalaccount = internalaccount;
		this.pointsdeduction = pointsdeduction;
		this.toaccountprofitandloss = toaccountprofitandloss;
		this.typeofinvoice = typeofinvoice;
		this.invoicevalue = invoicevalue;
		this.vouchers = vouchers;
		this.wipethemantissa = wipethemantissa;
	}

	@Override
	public String toString() {
		return "BillingInfo [bstatic=" + bstatic + ", bmoney=" + bmoney + ", materialsexpenses=" + materialsexpenses
				+ ", costoflabor=" + costoflabor + ", bdate=" + bdate + ", bman=" + bman + ", cash=" + cash
				+ ", bankcard=" + bankcard + ", bill=" + bill + ", paymentoftheamount=" + paymentoftheamount
				+ ", atthecards=" + atthecards + ", atthedeposit=" + atthedeposit + ", collecttaxes=" + collecttaxes
				+ ", invoicenumber=" + invoicenumber + ", internalaccount=" + internalaccount + ", pointsdeduction="
				+ pointsdeduction + ", toaccountprofitandloss=" + toaccountprofitandloss + ", typeofinvoice="
				+ typeofinvoice + ", invoicevalue=" + invoicevalue + ", vouchers=" + vouchers + ", wipethemantissa="
				+ wipethemantissa + "]";
	}
    
    
}