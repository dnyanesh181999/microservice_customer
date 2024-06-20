package com.cjc.loanapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.loanapplication.model.Customer;
import com.cjc.loanapplication.servicei.CustomerServicei;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@Slf4j
@RequestMapping("/telecaller")
@RestController
public class TelecallerController {
	@Autowired
	CustomerServicei ci;


	@GetMapping(value="/getAllDefaultCustomer")
	public ResponseEntity<List<Customer>> customerLogin()
	{
		
		List<Customer>list=ci.findAllDefaultCustomer();
		if(!list.isEmpty())
		{
			log.info("Getting all default customer sucessfully");
			return new ResponseEntity<List<Customer>> (list,HttpStatus.OK);
			
		}
		else {
			log.warn("no any default Customer  data found");
			return new ResponseEntity<List<Customer>> (HttpStatus.BAD_REQUEST);
		}	
	
	}
	
}
