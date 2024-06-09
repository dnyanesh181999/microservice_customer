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
public class CustomerPermanent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer permanentId;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private Long pincode;
	private String houseNo;
	private String streetName;
}
