package com.example.mycatdemo.controller;

import com.example.mycatdemo.domain.Company;
import com.example.mycatdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:40
 * @description
 */
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "listCompany")
    public List<Company> listCompany() {
        return companyService.listCompany();
    }

    @GetMapping(value = "addCompany")
    public String addCompany(Company company) {
        companyService.addCompany(company);

        return "ok";
    }
}
