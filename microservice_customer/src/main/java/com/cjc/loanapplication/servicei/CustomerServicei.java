package com.cjc.loanapplication.servicei;

import java.util.List;

import com.cjc.loanapplication.model.Customer;
import com.cjc.loanapplication.model.EmiStatement;

public interface CustomerServicei {

	 public Customer findByUsernameAndPasswor(String customerUsername, String customerPassword);

	public Customer updatestatus(String remark, Integer customerId);

	public Customer payEmi(Integer customerId);

	public Customer unPaidEmi(Integer customerId);

	public List<Customer> findAllDefaultCustomer();

}
