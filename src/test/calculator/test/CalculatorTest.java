package test.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import test.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calaulator = new Calculator();
		assertEquals(30, calaulator.sum(10, 20));
	}

}
