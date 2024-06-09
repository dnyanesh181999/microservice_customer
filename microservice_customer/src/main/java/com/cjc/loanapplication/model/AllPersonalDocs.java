package com.cjc.loanapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllPersonalDocs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer documentId;
	@Lob
	@Column(length = 6700000)
	private byte[] addressProof;
	@Lob
	@Column(length = 6700000)
	private byte[] panCard;
	@Lob
	@Column(length = 6700000)
	private byte[] aadharCard;
	@Lob
	@Column(length = 6700000)
	private byte[] incomeTaxReturn;
	@Lob
	@Column(length = 6700000)
	private byte[] photo;
	@Lob
	@Column(length = 6700000)
	private byte[] signature;
	@Lob
	@Column(length = 6700000)
	private byte[] thumb;
	@Lob
	@Column(length = 6700000)
	private byte[] bankCheque;
	@Lob
	@Column(length = 6700000)
	private byte[] bankStatement;
	@Lob
	@Column(length = 6700000)
	private byte[] propertyProof;
	@Lob
	@Column(length = 6700000)
	private byte[] propertyInsurance;
	@Lob
	@Column(length = 6700000)
	private byte[] professionalSalarySlips;
	
}
