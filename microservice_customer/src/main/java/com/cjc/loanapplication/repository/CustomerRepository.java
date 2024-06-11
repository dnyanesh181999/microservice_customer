package com.cjc.loanapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.loanapplication.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{
	public Customer findByCustomerUsernameAndCustomerPassword(String customerUsername, String customerPassword);

	

}
