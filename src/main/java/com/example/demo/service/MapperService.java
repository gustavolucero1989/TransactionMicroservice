package com.example.demo.service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;

public interface MapperService {
	public TransactionDTO toDTO(Transaction transaction);
	public Transaction toEntity(TransactionDTO transactionDTO);
}
