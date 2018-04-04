package com.coilabs.model.data;

import com.coilabs.model.BaseVO;

public class UserP extends BaseVO {
    private Integer userId;

    private Integer deptId;

    private String password;

    private Integer state;

    private Integer loginType;

    private String reserve1U;

    private String reserve2U;

    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getReserve1U() {
        return reserve1U;
    }

    public void setReserve1U(String reserve1U) {
        this.reserve1U = reserve1U == null ? null : reserve1U.trim();
    }

    public String getReserve2U() {
        return reserve2U;
    }

    public void setReserve2U(String reserve2U) {
        this.reserve2U = reserve2U == null ? null : reserve2U.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*public byte[] getUserName() {
        return userName;
    }

    public void setUserName(byte[] userName) {
        this.userName = userName;
    }*/
}