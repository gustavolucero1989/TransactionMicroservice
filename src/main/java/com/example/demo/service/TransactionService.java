package com.example.demo.service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;

public interface TransactionService {
	public Transaction postTransaction(TransactionDTO transactionDTO)throws Exception;
}
