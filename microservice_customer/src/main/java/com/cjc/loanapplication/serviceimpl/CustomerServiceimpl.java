package com.cjc.loanapplication.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.loanapplication.exceptions.InvalidEmployeeIdException;
import com.cjc.loanapplication.exceptions.NoResourceFoundException;
import com.cjc.loanapplication.model.Customer;

import com.cjc.loanapplication.repository.CustomerRepository;
import com.cjc.loanapplication.servicei.CustomerServicei;

@Service
public class CustomerServiceimpl implements CustomerServicei
{
	@Autowired
	CustomerRepository cr;

	@Override
	public Customer findByUsernameAndPasswor(String customerUsername, String customerPassword) 
	{
		Customer csm=cr.findByCustomerUsernameAndCustomerPassword(customerUsername, customerPassword);
		if(csm!=null)
			{
			return csm;
			}
			else 
			{
			throw new InvalidEmployeeIdException("customer Not Found");		
			}
		
		
	}

	@Override
	public Customer updatestatus(String remark, Integer customerId) {
		Optional<Customer> os = cr.findById(customerId);
		if(os.isPresent())
		{
	Customer cust=os.get();
		cust.setStatus(remark);;
		Customer c=cr.save(cust);
		return c;
		
		}
		
		
		else {
			throw new NoResourceFoundException("Faild to update status");
		}
		
 	
		
	}
	

}
