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
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer guarantorId;
	private String guarantorName;
	private String guarantorDOB;
	private String guarantorReationshipWithCustomer;
	private Long guarantorMobileNo;
	private Long guarantorAdharcardNo;
	private String guarantorCityName;
	private String guarantorJobDetails;
	private String guarantorAreaName;
}
