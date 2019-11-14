package com.training.junit.sentenceeditor.myexception;

/**
 * 
 * @author MManjula
 *
 */
public class NoSuchWordFoundException extends Exception {

	public NoSuchWordFoundException() {
	}

	public NoSuchWordFoundException(String message) {
		super(message);
	}

}
