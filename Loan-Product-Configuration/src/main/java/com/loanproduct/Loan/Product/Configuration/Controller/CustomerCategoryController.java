package com.loanproduct.Loan.Product.Configuration.Controller;

import com.loanproduct.Loan.Product.Configuration.Entity.Customer_Category;
import com.loanproduct.Loan.Product.Configuration.Repository.CustomerCategoryRepository;
import com.loanproduct.Loan.Product.Configuration.Service.CustomerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerCategoryController {

    @Autowired
    private CustomerCategoryService customerCategoryService;

    @PostMapping("/saveCustomerCategory")
    public Customer_Category saveData(@RequestBody Customer_Category customerCategory){
        return customerCategoryService.saveData(customerCategory);
    }

    @GetMapping("/findAllCategories")
    public List<Customer_Category> getAllCategories(){
            return customerCategoryService.getAllCategories();
    }
}
