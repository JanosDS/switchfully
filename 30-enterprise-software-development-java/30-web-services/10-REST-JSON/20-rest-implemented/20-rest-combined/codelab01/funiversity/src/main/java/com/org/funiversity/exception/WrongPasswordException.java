package com.org.funiversity.exception;

public class WrongPasswordException extends RuntimeException {
	public WrongPasswordException(String message) {
		super(message);
	}
}
