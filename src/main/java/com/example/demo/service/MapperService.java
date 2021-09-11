package com.example.demo.service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;

public interface MapperService {
	public TransactionDTO trasactionToDTO(Transaction transaction);
	public Transaction transactioDTOToEntity(TransactionDTO transactionDTO);
}
