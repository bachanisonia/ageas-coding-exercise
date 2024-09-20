package uk.co.ageas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise2Test {

	private static final String TEST_INPUT_1 = "1111";
    private static final String TEST_INPUT_2 = "0101";
    private static final String TEST_INPUT_3 = "1101";
    private static final String TEST_INPUT_4 = "0001";
    private static final String TEST_INPUT_5 = "00-10";

    @Test
    public void testCase1() {
        assertEquals("I am 15", Exercise2.check(TEST_INPUT_1));
    }

    @Test
    public void testCase2() {
        assertEquals("I am 10", Exercise2.check(TEST_INPUT_2));
    }

    @Test
    public void testCase3() {
         assertEquals("I am 11", Exercise2.check(TEST_INPUT_3));
    }

    @Test
    public void testCase4() {
          assertEquals("I am default", Exercise2.check(TEST_INPUT_4));
    }

    @Test
    public void testCase5() {
        assertEquals("Invalid input", Exercise2.check(TEST_INPUT_5));
    }


}
