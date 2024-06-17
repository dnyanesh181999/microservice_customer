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
public class EmiStatement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emiStatementId;
	private Double amount;
	private String date;
	private String status;
}
