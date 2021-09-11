package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	MapperService mapper;

	public Transaction postTransaction(TransactionDTO transactionDTO) {
	 return transactionRepository.save(mapper.transactioDTOToEntity(transactionDTO));	
	}

}
