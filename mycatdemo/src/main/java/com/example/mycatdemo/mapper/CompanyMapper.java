package com.example.mycatdemo.mapper;

import com.example.mycatdemo.domain.Company;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:42
 * @description
 */
public interface CompanyMapper {
    List<Company> selectCompanyList();

    void addCompany(final Company company);
}
