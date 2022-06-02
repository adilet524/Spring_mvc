package mvcCrud.service;

import mvcCrud.models.Company;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);

    void removeCompanyById(Long id);

    Company getById(Long id);

    List<Company> getAllCompany();

    void update(Long id, Company company);

}
