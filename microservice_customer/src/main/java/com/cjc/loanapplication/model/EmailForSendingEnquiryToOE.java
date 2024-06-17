package com.cjc.loanapplication.model;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailForSendingEnquiryToOE {
@Value("$spring.mail.username")
private String fromGmail;
private String toMail;
private String subject;
private String textMessage;
}
