package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;

@Service
public class MapperServiceImpl implements MapperService{

	@Override
	public TransactionDTO toDTO(Transaction transaction) {
		TransactionDTO transactionDTO = TransactionDTO.builder()
				.userFrom(transaction.getUserFrom())
				.userTo(transaction.getUserTo())
				.amount(transaction.getAmount())
				.currency(transaction.getCurrency())
				.build();
		return transactionDTO;
	}

	@Override
	public Transaction toEntity(TransactionDTO transactionDTO) {
		Transaction transaction = Transaction.builder()
				.userFrom(transactionDTO.getUserFrom())
				.userTo(transactionDTO.getUserTo())
				.amount(transactionDTO.getAmount())
				.currency(transactionDTO.getCurrency())
				.build();
		return transaction;
	}

}
