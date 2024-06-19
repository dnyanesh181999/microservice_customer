package com.cjc.loanapplication.serviceimpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.loanapplication.exceptions.InvalidEmployeeIdException;
import com.cjc.loanapplication.exceptions.NoResourceFoundException;
import com.cjc.loanapplication.model.Customer;
import com.cjc.loanapplication.model.EmiStatement;
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

	@Override
	public Customer payEmi(Integer customerId) {
		
		Optional<Customer>opt=cr.findById(customerId);
		if(opt.isPresent()) {
			Customer cust =opt.get();
			List<EmiStatement>list=cust.getLedger().getEmiStatement();
			EmiStatement e = new EmiStatement();
			e.setAmount(cust.getLedger().getMonthlyEmi());
			e.setStatus("PAID");
			LocalDate localDate = LocalDate.now();
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		     String formattedDate = localDate.format(formatter);
			e.setDate(formattedDate);
			list.add(e);
			cust.getLedger().setEmiStatement(list);
			Double amount =cust.getLedger().getAmountPaidTillDate()+cust.getLedger().getMonthlyEmi();
			cust.getLedger().setAmountPaidTillDate(amount);
			Double remainingAmount=cust.getLedger().getRemainingAmount()-cust.getLedger().getMonthlyEmi();
			cust.getLedger().setRemainingAmount(remainingAmount);
			if(cust.getLedger().getRemainingAmount()==0.0000 || cust.getLedger().getRemainingAmount()<5.0000) {
				cust.getLedger().setLoanStatus("NIL");
				cust.setStatus("LoanPaid");
				cust.getLedger().setRemainingAmount(0.0000);
			}
			else {
				cust.getLedger().setLoanStatus("Unpaid");
			}
			
			Customer c=cr.save(cust);
			if(c!=null) {
				return c;
			}
			else {
				throw new NoResourceFoundException("Faild to Pay EMI ");

			}
			
			
		
		}
		else {
			throw new NoResourceFoundException("No Customer found for pay EMI");
		}
		
	}
	

}
