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
    
    @Test
    public void testNegativeNumver(){
    	try {
			Calculator.add("-1,3");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			Calculator.add("2,-5,3,-7");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -5,-7");
		}
    }
}
