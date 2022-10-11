package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.RomanToInteger;

import junit.framework.TestCase;

@Testable
public class RomanToIntegerTest extends TestCase {

	RomanToInteger solUnderTest = new RomanToInteger();

	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("The roman numeral I is equal to the integer 1")
	public void testInput_1() {
		assertEquals(1, solUnderTest.sol.romanToInt("I"));
	}

	@Test
	@DisplayName("The roman numeral III is equal to the integer 3")
	public void testInput_2() {
		assertEquals(3, solUnderTest.sol.romanToInt("III"));
	}

	@Test
	@DisplayName("The roman numeral LVIII is equal to the integer 58")
	public void testInput_3() {
		assertEquals(58, solUnderTest.sol.romanToInt("LVIII"));
	}

	@Test
	@DisplayName("The roman numeral MCMXCIV is equal to the integer 1994")
	public void testInput_4() {
		assertEquals(1994, solUnderTest.sol.romanToInt("MCMXCIV"));
	}

}
