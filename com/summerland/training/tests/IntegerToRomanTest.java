package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.IntegerToRoman;

import junit.framework.TestCase;

@Testable
public class IntegerToRomanTest extends TestCase {

	IntegerToRoman solUnderTest = new IntegerToRoman();

	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("The integer 1 translates to the roman numeral I")
	public void testInput_1() {
		assertEquals("I", solUnderTest.sol.intToRoman(1));
	}

	@Test
	@DisplayName("The integer 3 translates to the roman numeral III")
	public void testInput_2() {
		assertEquals("III", solUnderTest.sol.intToRoman(3));
	}

	@Test
	@DisplayName("The integer 58 translates to the roman numeral LVIII")
	public void testInput_3() {
		assertEquals("LVIII", solUnderTest.sol.intToRoman(58));
	}

	@Test
	@DisplayName("The integer 1994 translates to the roman numeral MCMXCIV")
	public void testInput_4() {
		assertEquals("MCMXCIV", solUnderTest.sol.intToRoman(1994));
	}

	@Test
	@DisplayName("The integer 100 translates to the roman numeral C")
	public void testInput_5() {
		assertEquals("C", solUnderTest.sol.intToRoman(100));
	}
}
