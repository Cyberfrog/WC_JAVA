import static org.junit.Assert.*;
import org.junit.Test;
public class WCTest{
	@Test
	public void wc_getWordCount_returns_no_of_word_from_string(){
		WC wCounter = new WC("hi this 4 word");
		assertEquals(4,wCounter.getWordCount());
	}
	@Test
	public void wc_getLineCount_returns_no_of_Line_from_string(){
		WC wCounter = new WC("hi this 4 word \n hi\n byee ");
		assertEquals(3,wCounter.getLineCount());
	}
	@Test
	public void wc_getCharCount_returns_no_of_charector_from_string(){
		WC wCounter = new WC("hi this 4 word \n hi\n byee ");
		assertEquals(26,wCounter.getCharCount());
	}
	@Test
	public void wc_toString_returns_all_count_formated_string(){
		WC wCounter = new WC("hi this 4 word\nhi\nbyee");
		assertTrue(wCounter.toString("").equals("3 6 22"));
	}
	@Test
	public void wc_getByteCount_counts_the_bytes_for_string(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertEquals(wCounter.getByteCount(),45);
	}
	@Test
	public void wc_toString_for_c_option_returns_beytecount(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertEquals(wCounter.toString("-c"),"45");
	}
	@Test
	public void wc_toString_for_l_option_returns_Linecount(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertEquals(wCounter.toString("-l"),"2");
	}
	@Test
	public void wc_toString_for_w_option_returns_wordcount(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertEquals(wCounter.toString("-w"),"10");
	}
	@Test
	public void wc_getShortestLine_returns_shoretest_line_from_text(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertTrue(wCounter.getShortestLine().equals("What do you think?"));
	}
	@Test
	public void wc_getLongestLine_returns_Longest_line_from_text(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertTrue(wCounter.getLagestLine().equals("hello, this is a good day."));
	}
	public void wc_toString_for_L_option_returns_longestLine_with_Length(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertTrue(wCounter.getLagestLine().equals("26 hello, this is a good day."));
	}
	public void wc_toString_for_S_option_returns_shortestLine_with_Length(){
		WC wCounter = new WC("hello, this is a good day.\nWhat do you think?");
		assertTrue(wCounter.getShortestLine().equals("18 What do you think?"));
	}
}