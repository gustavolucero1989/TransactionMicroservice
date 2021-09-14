package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionDTO {

	private String userTo;
	private String userFrom;
	private Double amount;
	private String currency;

}
