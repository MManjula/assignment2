package com.training.junit.sentenceeditor.myexception;

public class NoSuchWordFoundException extends Exception {

	public NoSuchWordFoundException() {
	}

	public NoSuchWordFoundException(String message) {
		super(message);
	}

}
