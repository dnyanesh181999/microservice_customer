package com.cjc.loanapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDependent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dependentId;
	private String fatherName;
	private String motherName;
	private Integer noOfChild;
	private String maritalStatus;
	private Integer noOfFamilyMember;
	private Double familyIncome;
	private String spouseName;
	private Integer dependentMember;
	
}
