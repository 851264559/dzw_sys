package com.accp.pojo.cwl;

import java.util.Date;
/**
 * 	������Ϣ
 * @author ���ӵȵȰ�
 *
 */
public class BillingInfo {
	
    private String bstatic;//����״̬

    private Float bmoney;//������

    private Float materialsexpenses;//���Ϸ�

    private Float costoflabor;//��ʱ��

    private Date bdate;//��������

    private String bman;//������

    private Float cash;//�ֽ�

    private String bankcard;//���п�

    private String bill;//Ʊ��

    private Float paymentoftheamount;//���˽��

    private String atthecards;//�崢ֵ��

    private Float atthedeposit;//�嶨��

    private Float collecttaxes;//��˰��

    private String invoicenumber;//��Ʊ��

    private Float internalaccount;//�ڲ���

    private Float pointsdeduction;//���ֵֿ�

    private Float toaccountprofitandloss;//����ӯ��

    private String typeofinvoice;//��Ʊ����

    private Float invoicevalue;//��Ʊ���

    private Float vouchers;//���þ�

    private Float wipethemantissa;//Ĩβ��

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