package com.cjc.loanapplication.servicei;

import com.cjc.loanapplication.model.Customer;

public interface CustomerServicei {

	 public Customer findByUsernameAndPasswor(String customerUsername, String customerPassword);

	public Customer updatestatus(String remark, Integer customerId);

}
