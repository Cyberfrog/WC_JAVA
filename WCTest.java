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
		assertTrue(wCounter.toString().equals("3 6 22"));
	}
}