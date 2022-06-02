package mvcCrud.repository.impl;

import mvcCrud.models.Company;
import mvcCrud.repository.CompanyRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CompanyRepositoryImpl implements CompanyRepository {
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
