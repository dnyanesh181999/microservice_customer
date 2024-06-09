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
public class PropertyAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer propertyAddressId;
	private String propertyAreaName;
	private String propertyCityName;
	private String propertyDistrict;
	private String propertyState;
	private Long propertyPinCode;
}
