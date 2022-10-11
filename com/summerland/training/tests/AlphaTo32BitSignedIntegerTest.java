package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.AlphaTo32BitSignedInteger;

import junit.framework.TestCase;

@Testable
public class AlphaTo32BitSignedIntegerTest extends TestCase {

	AlphaTo32BitSignedInteger solUnderTest = new AlphaTo32BitSignedInteger();
	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("The character string '-0' converts to the signed integer value of 0")
	public void testInput_1() {
		assertEquals(0, solUnderTest.sol.myAtoi("-0"));
	}

	@Test
	@DisplayName("The character string '1' converts to the signed integer value of 1")
	public void testInput_2() {
		assertEquals(1, solUnderTest.sol.myAtoi("1"));
	}
	
	@Test
	@DisplayName("The character string '   -1' converts to the signed integer value of -1")
	public void testInput_3() {
		assertEquals(-1, solUnderTest.sol.myAtoi("    -1"));
	}

	@Test
	@DisplayName("The character string '4193 with words' converts to the signed integer value of 4193")
	public void testInput_4() {
		assertEquals(4193, solUnderTest.sol.myAtoi("4193 with words"));
	}

	@Test
	@DisplayName("The character string '   -42' converts to the signed integer value of -42")
	public void testInput_5() {
		assertEquals(-42, solUnderTest.sol.myAtoi("   -42"));
	}

	@Test
	@DisplayName("The character string '0000-876' converts to the signed integer value of 0")
	public void testInput_6() {
		assertEquals(0, solUnderTest.sol.myAtoi("0000-876"));
	}

	@Test
	@DisplayName("The character string '-2147483647' converts to the signed integer value of -2147483647")
	public void testInput_7() {
		assertEquals(-2147483647, solUnderTest.sol.myAtoi("-2147483647"));
	}

	@Test
	@DisplayName("The character string '123-' converts to the signed integer value of 123")
	public void testInput_8() {
		assertEquals(123, solUnderTest.sol.myAtoi("123-"));
	}
}
