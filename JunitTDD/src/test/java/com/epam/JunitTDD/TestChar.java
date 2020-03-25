package com.epam.JunitTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;

class TestChar {
	/*
	 * 1.ABCD => BCD
	   2.AACD => CD 
	   3.BACD => BCD
	   4.BBAA => BBAA       
	   5.AABAA => BAA
	   6.A    =>" "
	   7.AA   =>" "
	   8.B    =>B
	   9." "   =>" "

	 */

	CharRemoval s=new CharRemoval();
	@BeforeEach
	void setUp() {
		CharRemoval s=new CharRemoval();
	}
	
	@Test
	void char_removal_test1() {
		assertEquals("BCD",s.testremove("ABCD"));
	}

	@Test
	void char_removal_test2() {
		assertEquals("CD",s.testremove("AACD"));
	}

	@Test
	void char_removal_test3() {
		assertEquals("BCD",s.testremove("BACD"));
	}

	@Test
	void char_removal_test4() {
		assertEquals("BBAA",s.testremove("BBAA"));
	}

	@Test
	void char_removal_test5() {
		assertEquals("BAA",s.testremove("AABAA"));
	}
	@Test
	void char_removal_test6() {
		assertEquals(" ",s.testremove("A"));
	}
	@Test
	void char_removal_test7() {
		assertEquals(" ",s.testremove("AA"));
	}
	@Test
	void char_removal_test8() {
		assertEquals("B",s.testremove("B"));
	}
	@Test
	void char_removal_test9() {
		assertEquals(" ",s.testremove(""));
	}

}



