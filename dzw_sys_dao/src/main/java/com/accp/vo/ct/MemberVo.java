package com.accp.vo.ct;

public class MemberVo {
    private String cid;
    private String value;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MemberVo() {
    }

    public MemberVo(String cid, String value) {
        this.cid = cid;
        this.value = value;
    }
}
