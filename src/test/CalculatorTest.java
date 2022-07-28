package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(10, 20));
	}
	
	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.minus(10, 20));
	}
	
	@Test
	public void testCompareSize() {
		Calculator calculator = new Calculator();
		int[] number = {20,10};
		assertArrayEquals(number, calculator.compareSize(10, 20));
	}

}
