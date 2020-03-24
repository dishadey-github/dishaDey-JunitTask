package epamTDDJunit_disha.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class junittest {

	@Test
	void testCase1() {
		DeleteA deleteA = new DeleteA();
		String actual= deleteA.delete("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testCase2() {
		DeleteA deleteA = new DeleteA();
		String actual= deleteA.delete("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testCase3() {
		DeleteA deleteA = new DeleteA();
		String actual= deleteA.delete("BBAA");
		assertEquals("BBAA",actual);
	}
}
