package com.cjc.loanapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.loanapplication.model.Customer;
import com.cjc.loanapplication.model.EmiStatement;
import com.cjc.loanapplication.servicei.CustomerServicei;

import lombok.extern.slf4j.Slf4j;


@CrossOrigin("*")
@Slf4j
@RequestMapping("/customerLogin")
@RestController
public class CustomerController
{
	@Autowired
	CustomerServicei ci;
	
	
	@GetMapping(value="/customer/{customerUsername}/{customerPassword}")
	public ResponseEntity<Customer> customerLogin(@PathVariable String customerUsername,@PathVariable  String customerPassword)
	{
		System.out.println(customerUsername+ "  " +customerPassword);
		Customer csm=ci.findByUsernameAndPasswor(customerUsername,customerPassword);
		if(csm!=null)
		{
			log.info("Getting Customer data  By username and password Succesfully ");
			return new ResponseEntity<Customer> (csm,HttpStatus.OK);
			
		}
		else {
			log.warn("no any Customer  data found");
			return new ResponseEntity<Customer> (HttpStatus.BAD_REQUEST);
		}	
	}
	
	
	
	
	
	
	
	@PatchMapping("/updateStatusByremark/{remark}/{customerId}")
	public ResponseEntity<Customer> updatestatus(@PathVariable String remark,@PathVariable Integer customerId,@RequestBody Customer customer )
	{
		Customer c=ci.updatestatus(remark,customerId);
		if(c!=null)
		{
			log.info("Customer Remark Updated sucessfully");
		return new ResponseEntity<Customer>(c,HttpStatus.OK);
		}
		else {
			log.error("Failed to update remark");
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/payEmi/{customerId}")
	public ResponseEntity<Customer>payEmi(@PathVariable Integer customerId){
		Customer customer = ci.payEmi(customerId);
		if(customer!=null) {
			log.info("EMI PAY sucessfully");
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
		else {
			log.error("Failed to pay EMI");
			return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
	}

}
