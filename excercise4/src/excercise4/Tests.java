package excercise4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	
	TextAnalytics text = new TextAnalytics("C:testText.txt");
	
	@Test
	public void TestFileReading() {
		assertEquals(text.file_content, "Test test TEXT.");
	}
	
	@Test
	public void TestWordSplitting() {
		assertEquals(text.array_of_words.length, 3);
	}
	
	@Test
	public void TestIfSplittedWordsAreOrderedCorrectly() {
		String result = text.array_of_words[0] + text.array_of_words[1] + text.array_of_words[2];
		assertEquals(result, "testtesttext.");
	}
	
	@Test
	public void TestIfFirstWordIsLowerCased() {
		assertEquals(text.array_of_words[0], "test");
	}
	
	@Test
	public void TestIfThirdtWordIsLowerCased() {
		assertEquals(text.array_of_words[2], "text.");
	}
	
	@Test
	public void TestWordCounting() {
		assertEquals(text.counter.size(), 2);
	}
	
	@Test
	public void TestIfWordCountingIsCountingCorrectly() {
		Integer count = new Integer(1);
		assertEquals(text.counter.get("text."), count);
	}
	
	@Test
	public void TestIfWordCountingIsCountingCorrectly2() {
		Integer count = new Integer(2);
		assertEquals(text.counter.get("test"), count);
	}
}
