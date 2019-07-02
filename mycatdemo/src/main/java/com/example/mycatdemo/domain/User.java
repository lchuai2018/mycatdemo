package com.example.mycatdemo.domain;

import java.io.Serializable;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:41
 * @description
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5088697673359856350L;

    private Integer userId;

    private String userName;

    private Integer companyId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}