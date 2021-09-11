package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "trasaccion")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_to")
	private String userTo;
	@Column(name = "user_from")
	private String userFrom;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "date")
	private LocalDateTime date = LocalDateTime.now();
	@Column(name = "currency")
	private String currency;

	public Transaction() {

	}

	public Transaction(String userTo, String userFrom, Double amount, String currency) {
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
