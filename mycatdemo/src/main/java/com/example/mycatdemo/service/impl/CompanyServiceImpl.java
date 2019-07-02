package com.example.mycatdemo.service.impl;

import com.example.mycatdemo.domain.Company;
import com.example.mycatdemo.mapper.CompanyMapper;
import com.example.mycatdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:45
 * @description
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> listCompany() {
        return companyMapper.selectCompanyList();
    }

    @Override
    public void addCompany(Company company) {
        companyMapper.addCompany(company);
    }
}