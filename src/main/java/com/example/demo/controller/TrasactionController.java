package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.service.TransactionService;
import com.example.demo.utils.ResponseDTO;

@RestController
@RequestMapping("/transactions")
public class TrasactionController {
	
	@Autowired
	TransactionService transactionService;

    @PostMapping
    public ResponseEntity<ResponseDTO> postTransaction(@RequestBody TransactionDTO transactionDTO){
        return new ResponseEntity<>(new ResponseDTO(transactionService.postTransaction(transactionDTO),
                "CREATED_OK"), HttpStatus.CREATED);
    }

	public TransactionService getTransactionService() {
		return transactionService;
	}

	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	} 
	
}
