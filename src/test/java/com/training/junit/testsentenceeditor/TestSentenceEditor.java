package com.training.junit.testsentenceeditor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.junit.sentenceeditor.SentenceEditor;
import com.training.junit.sentenceeditor.myexception.NoSuchWordFoundException;

/**
 * 
 * @author MManjula
 *
 */
public class TestSentenceEditor {

	private SentenceEditor<Object> editor;

	/**
	 * creates object before each test class
	 */
	@Before
	public void setUp() {
		editor = new SentenceEditor<Object>();
	}

	/**
	 * test for removing extra space from the sentence
	 */
	@Test
	public void testExtraSpaceWithinSentence() {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String expected = "A MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY";
		assertEquals(expected, editor.spaceTrimmer(input));
	}

	/**
	 * 
	 * test for deleting the specified word in the specified position
	 */
	@Test
	public void testExtraSpaceAndDeleteTheWord() throws NoSuchWordFoundException {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String expected = "A MORNING WALK IS A BLESSING FOR THE WHOLE DAY";
		assertEquals(expected, editor.wordDeletor(input, "IS", 6));
	}

	/**
	 * 
	 * @throws NoSuchWordFoundException if the word enetered by the user is invalid
	 */
	@Test(expected = NoSuchWordFoundException.class)
	public void testInvalidInput() throws NoSuchWordFoundException {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		editor.wordDeletor(input, "EVENING", 4);
	}

	/**
	 * clears the object after each test class
	 */
	@After
	public void tearDown() {
		editor = null;
	}

}
