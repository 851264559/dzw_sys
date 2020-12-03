package com.accp.pojo.cyj;

import java.util.Date;

/**
 * 功能表
 *
 */
public class Function {
	
    private Integer fid;//自增id

    private String fcode;//URL别名

    private String fname;//功能名称

    private Integer fpid;//功能父节点

    private Date createdate;//创建时间
    
    private Function parentFun;//父节点
    
    public Function getParentFun() {
		return parentFun;
	}

	public void setParentFun(Function parentFun) {
		this.parentFun = parentFun;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	@Override
	public String toString() {
		return "Function [fid=" + fid + ", fcode=" + fcode + ", fname=" + fname + ", fpid=" + fpid + ", createdate="
				+ createdate + ", parentFun=" + parentFun + "]";
	}
    
}