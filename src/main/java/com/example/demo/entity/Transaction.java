package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.dto.TransactionDTO;

@Entity(name = "trasaccion")
public class Transaction {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "usuario_destino")
	private String userTo;
    @Column(name = "usuario_origen")
	private String userFrom;
    @Column(name = "monto")
	private Double amount;
	
	public Transaction() {
		
	}

	public Transaction(String userTo, String userFrom, Double amount) {
		this.userTo = userTo;
		this.userFrom = userFrom;
		this.amount = amount;
	}
	
	public Transaction (TransactionDTO transactionDTO) {
		this.userFrom = transactionDTO.getUserFrom();
		this.userTo = transactionDTO.getUserTo();
		this.amount = transactionDTO.getAmount();
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
