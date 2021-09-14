package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Entity(name = "trasaccion")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private Long id;

	@Column(name = "user_to")
	private String userTo;
	@Column(name = "user_from")
	private String userFrom;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "date")
	private LocalDateTime date;
	@Column(name = "currency")
	private String currency;

}
