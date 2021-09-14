package com.example.demo.service;

import java.time.LocalDateTime;

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

	public Transaction postTransaction(TransactionDTO transactionDTO) throws Exception{
		try {
			if(transactionDTO != null) {
				return create(transactionDTO);
			} else {
				throw new Exception("La transaccion es invalida");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	 	
	}
	
	public Transaction create(TransactionDTO transactionDTO) throws Exception {
		Transaction transaction = mapper.toEntity(transactionDTO);
		preCreate(transaction);
		return transactionRepository.save(transaction);
	}
	
	public Transaction preCreate(Transaction transaction) throws Exception {
		if(transaction.getAmount() == null || transaction.getAmount()<=0 ) {
			throw new Exception("El monto debe ser positivo");
		}
		transaction.setDate(LocalDateTime.now());
		return transaction;
	}

}
