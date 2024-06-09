package com.cjc.loanapplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	private String customerName;
	private String customerUsername;
	private String customerPassword;
	private String customerMobileNo;
	private String customerEmailId;
	private String adharNo;
	private String pancardNo;
	private String gender;
	private String customerDob;
	private Integer customerAge;
	private String maritalStatus;
	private Long cibilScore;
	private Double totalLoanRequired;
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDependent customerDependent;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private EducationalDetails customerEducationalDeatils;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession customerProfession;
	@OneToOne(cascade = CascadeType.ALL)
	private Mortgage mortgage;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAccountDetails customerAccountDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails propertyDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocs allPersonalDocs;
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter;
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loanDisbursement;
	
	
	
	
}
