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
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer professionId;
	private String professionType;
	private Double professionSalary;
	private String professionSalaryType;
	private String professionWorkingPeriod;
	private String professionDesignation;
}
