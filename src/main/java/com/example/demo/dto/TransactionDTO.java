package com.example.demo.dto;

import com.example.demo.entity.Transaction;

public class TransactionDTO {
	
	private String userTo;
	private String userFrom;
	private Double amount;
	
	public TransactionDTO() {
		
	}

	public TransactionDTO(String userTo, String userFrom, Double amount) {
		this.userTo = userTo;
		this.userFrom = userFrom;
		this.amount = amount;
	}
	
	public TransactionDTO (Transaction transaction) {
		this.userFrom = transaction.getUserFrom();
		this.userTo = transaction.getUserTo();
		this.amount = transaction.getAmount();
	}

	public String getUserTo() {
		return userTo;
	}

	public void setUserTo(String userTo) {
		this.userTo = userTo;
	}

	public String getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
