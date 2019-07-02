package com.example.mycatdemo.service;

import com.example.mycatdemo.domain.Company;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:43
 * @description
 */
public interface CompanyService {

    List<Company> listCompany();

    void addCompany(final Company company);
}
