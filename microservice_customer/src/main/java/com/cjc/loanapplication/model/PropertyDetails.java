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
public class PropertyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer propertyId;
	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private Double propertyPrice;
	private Double constructionPrice;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propertyAddress;
}
