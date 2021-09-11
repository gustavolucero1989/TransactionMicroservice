package com.example.demo.dto;

public class TransactionDTO {

	private String userTo;
	private String userFrom;
	private Double amount;
	private String currency;

	public TransactionDTO() {

	}

	public TransactionDTO(String userTo, String userFrom, Double amount, String currency) {
		this.userTo = userTo;
		this.userFrom = userFrom;
		this.amount = amount;
		this.currency = currency;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
