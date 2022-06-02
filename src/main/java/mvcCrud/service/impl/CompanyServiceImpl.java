package mvcCrud.service.impl;

import mvcCrud.models.Company;
import mvcCrud.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    public Company saveCompany(Company company) {
        return null;
    }

    @Override
    public void removeCompanyById(Long id) {

    }

    @Override
    public Company getById(Long id) {
        return null;
    }

    @Override
    public List<Company> getAllCompany() {
        return null;
    }

    @Override
    public void update(Long id, Company company) {

    }
}
