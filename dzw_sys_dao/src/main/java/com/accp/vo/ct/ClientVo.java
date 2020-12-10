package com.accp.vo.ct;

public class ClientVo {
    private String bianhao;
    private String userType;

    public ClientVo() {
    }

    public ClientVo(String bianhao, String userType) {
        this.bianhao = bianhao;
        this.userType = userType;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
