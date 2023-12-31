package com.micro1service.hotel.exception;

import org.springframework.http.HttpStatus;

public class ResoureceNoFoundException extends RuntimeException {

	private static final long serialVersionUID = 2018907584644631778L;

	private HttpStatus status;

	public ResoureceNoFoundException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
