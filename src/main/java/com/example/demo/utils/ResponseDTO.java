package com.example.demo.utils;

public class ResponseDTO {

	private Object response;
	private String message;

	public ResponseDTO() {
	}

	public ResponseDTO(Object response, String message) {
		this.response = response;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
}
