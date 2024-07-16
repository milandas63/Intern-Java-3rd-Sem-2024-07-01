package com.exception;

public class NegativeAgeException extends InvalidAgeException {
	public NegativeAgeException() {
		super();
	}
	public NegativeAgeException(String message) {
		super(message);
	}
}
