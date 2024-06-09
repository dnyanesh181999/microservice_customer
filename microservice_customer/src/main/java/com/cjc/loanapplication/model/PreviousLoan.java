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
public class PreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer previousLoanId;
	private Double previousLoanAmount;
	private Double paidAmount;
	private Double remainingAmount;
	private Integer defaulterCount;
	private String loanStatus;
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank previousBankDetails;
}
