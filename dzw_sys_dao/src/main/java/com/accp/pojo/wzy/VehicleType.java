package com.accp.pojo.wzy;

/**
 * 车辆型号
 * 
 * @author wzy
 *
 */
public class VehicleType {
	private Integer vtypeid;// 型号序号
	private Integer enginetypeid;// 发动机品牌
	private Integer carbrand;// 车辆品牌
	private String vtypeno;// 型号编号
	private String vtypename;// 型号名称
	private Float vprice;// 参考价格
	private String vdate;// 车辆年款
	private Integer vpower;// 功率
	private String fuelmark;// 燃油标号

	private Integer vbrandid;
	private String vbrandno;
	private String vbrandname;

	private String enginetypename;
	
	public Integer getVbrandid() {
		return vbrandid;
	}

	public void setVbrandid(Integer vbrandid) {
		this.vbrandid = vbrandid;
	}

	public String getVbrandno() {
		return vbrandno;
	}

	public void setVbrandno(String vbrandno) {
		this.vbrandno = vbrandno;
	}

	public String getVbrandname() {
		return vbrandname;
	}

	public void setVbrandname(String vbrandname) {
		this.vbrandname = vbrandname;
	}

	public String getEnginetypename() {
		return enginetypename;
	}

	public void setEnginetypename(String enginetypename) {
		this.enginetypename = enginetypename;
	}

	public Integer getVtypeid() {
		return vtypeid;
	}

	public void setVtypeid(Integer vtypeid) {
		this.vtypeid = vtypeid;
	}

	public Integer getEnginetypeid() {
		return enginetypeid;
	}

	public void setEnginetypeid(Integer enginetypeid) {
		this.enginetypeid = enginetypeid;
	}

	public Integer getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(Integer carbrand) {
		this.carbrand = carbrand;
	}

	public String getVtypeno() {
		return vtypeno;
	}

	public void setVtypeno(String vtypeno) {
		this.vtypeno = vtypeno;
	}

	public String getVtypename() {
		return vtypename;
	}

	public void setVtypename(String vtypename) {
		this.vtypename = vtypename;
	}

	public Float getVprice() {
		return vprice;
	}

	public void setVprice(Float vprice) {
		this.vprice = vprice;
	}

	public String getVdate() {
		return vdate;
	}

	public void setVdate(String vdate) {
		this.vdate = vdate;
	}

	public Integer getVpower() {
		return vpower;
	}

	public void setVpower(Integer vpower) {
		this.vpower = vpower;
	}

	public String getFuelmark() {
		return fuelmark;
	}

	public void setFuelmark(String fuelmark) {
		this.fuelmark = fuelmark;
	}

}
