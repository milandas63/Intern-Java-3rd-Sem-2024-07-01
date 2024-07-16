package com.exception;

public class ZeroAgeException extends InvalidAgeException {
	public ZeroAgeException() {
		super();
	}
	public ZeroAgeException(String message) {
		super(message);
	}
}
