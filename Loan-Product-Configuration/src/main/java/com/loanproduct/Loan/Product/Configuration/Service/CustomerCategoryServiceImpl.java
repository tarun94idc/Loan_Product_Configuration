package com.loanproduct.Loan.Product.Configuration.Service;

import com.loanproduct.Loan.Product.Configuration.Entity.Customer_Category;
import com.loanproduct.Loan.Product.Configuration.Repository.CustomerCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCategoryServiceImpl implements CustomerCategoryService{

    @Autowired
    private CustomerCategoryRepository customerCategoryRepository;
    @Override
    public Customer_Category saveData(Customer_Category customerCategory) {
        return customerCategoryRepository.save(customerCategory);
    }

    @Override
    public List<Customer_Category> getAllCategories() {
        return customerCategoryRepository.findAll();
    }
}
