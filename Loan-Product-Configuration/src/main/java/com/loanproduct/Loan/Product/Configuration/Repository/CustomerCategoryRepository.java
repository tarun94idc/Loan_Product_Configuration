package com.loanproduct.Loan.Product.Configuration.Repository;

import com.loanproduct.Loan.Product.Configuration.Entity.Customer_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryRepository extends JpaRepository<Customer_Category, Integer> {
}
