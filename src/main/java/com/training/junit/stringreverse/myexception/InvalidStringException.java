package com.training.junit.stringreverse.myexception;

public class InvalidStringException extends Exception {

	public InvalidStringException() {
	}

	public InvalidStringException(String message) {
		super(message);
	}

}
