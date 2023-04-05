package com.loanproduct.Loan.Product.Configuration.Service;

import com.loanproduct.Loan.Product.Configuration.Entity.Customer_Category;

import java.util.List;

public interface CustomerCategoryService {
    public Customer_Category saveData(Customer_Category customerCategory);

    public List<Customer_Category> getAllCategories();
}
