package com.example.mycatdemo.domain;

import java.io.Serializable;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:41
 * @description
 */
public class Company implements Serializable {

    private static final long serialVersionUID = 5088697673359856350L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}