package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.example.demo.controller.TrasactionController;
import com.example.demo.dto.TransactionDTO;
import com.example.demo.utils.ResponseDTO;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private TrasactionController trasactionController;

	@Test
	public void postTransaction() {
		// Parte 1
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setAmount(3000.0);
		transactionDTO.setUserFrom("Usuario1");
		transactionDTO.setUserTo("Usuario3");
		transactionDTO.setCurrency("BR");

		// Parte 2
		ResponseEntity<ResponseDTO> response = trasactionController.postTransaction(transactionDTO);

		// Parte 3
		Assertions.assertThat(response.getBody().getMessage()).isEqualTo("CREATED_OK");

	}
}