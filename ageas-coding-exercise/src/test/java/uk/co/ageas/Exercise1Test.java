package uk.co.ageas;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

class Exercise1Test {

	 	private static final String TEST_INPUT_1 = "6521714069616518831033";
	    private static final String TEST_INPUT_2 = "6121114-06961651-983103";
	    private static final String TEST_INPUT_3 = "ABCDEFGHijklMN";


	    @Test
	    public void testCase1() {
	        assertEquals("AGEAS!", Exercise1.input(TEST_INPUT_1));
	    }


	    @Test
	    public void testCase2() {
	        assertThrows(InvalidParameterException.class, () -> Exercise1.input(TEST_INPUT_2), "Only digits are allowed");
	    }


	    @Test
	    public void testCase3() {
	    	assertThrows(InvalidParameterException.class, () -> Exercise1.input(TEST_INPUT_3), "Only digits are allowed");
	    }

}
