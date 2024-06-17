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
public class Enquiry {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer enquiryId;
private String enquiryName;
private Integer age;
private String email;
private String mobileNo;
private String pancardNo;
private String aadharNo;
private String remark;  
private Long cibilScore; 
}
