package testsentenceeditor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.junit.sentenceeditor.SentenceEditor;
import com.training.junit.sentenceeditor.myexception.NoSuchWordFoundException;

public class TestSentenceEditor {

	private SentenceEditor<Object> editor;

	@Before
	public void setUp() {
		editor = new SentenceEditor<Object>();
	}

	@Test
	public void testExtraSpaceWithinSentence() {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String expected = "A MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY";
		assertEquals(expected, editor.spaceTrimmer(input));
	}

	@Test
	public void testExtraSpaceAndDeleteTheWord() throws NoSuchWordFoundException {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String expected = "A MORNING WALK IS A BLESSING FOR THE WHOLE DAY";
		assertEquals(expected, editor.wordDeletor(input, "IS", 6));
	}
	
	@Test(expected=NoSuchWordFoundException.class)
	public void testInvalidInput() throws NoSuchWordFoundException {
		String input = "A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		editor.wordDeletor(input, "EVENING", 4);
	}

	@After
	public void tearDown() {
		editor = null;
	}

}
