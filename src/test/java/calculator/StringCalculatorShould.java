package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	
	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("calculator");
	    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(3, Calculator.add("3"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(8, Calculator.add("6,2"));
	}
	
	@Test
    public void testThreeNumbers(){
    	assertEquals(8, Calculator.add("1,3,4"));
    }

    @Test
    public void testNewLine(){
    	assertEquals(8, Calculator.add("1\n3,4"));
    }
}
