package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;

@Service
public class MapperServiceImpl implements MapperService{

	@Override
	public TransactionDTO trasactionToDTO(Transaction transaction) {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setUserFrom(transaction.getUserFrom());
		transactionDTO.setUserTo(transaction.getUserTo());
		transactionDTO.setAmount(transaction.getAmount());
		transactionDTO.setCurrency(transaction.getCurrency());
		return transactionDTO;
	}

	@Override
	public Transaction transactioDTOToEntity(TransactionDTO transactionDTO) {
		Transaction transaction = new Transaction();
		transaction.setUserFrom(transactionDTO.getUserFrom());
		transaction.setUserTo(transactionDTO.getUserTo());
		transaction.setAmount(transactionDTO.getAmount());
		transaction.setCurrency(transactionDTO.getCurrency());
		return transaction;
	}

}
