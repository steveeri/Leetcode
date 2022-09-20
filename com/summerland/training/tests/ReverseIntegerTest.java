package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.ReverseInteger;

import junit.framework.TestCase;

@Testable
public class ReverseIntegerTest extends TestCase {

	ReverseInteger solUnderTest = new ReverseInteger();

	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("The reverse of the integer -0 is 0")
	public void testInput_1() {
		assertEquals(0, solUnderTest.sol.reverse(-0));
	}

	@Test
	@DisplayName("The reverse of the integer 123 is 321")
	public void testInput_2() {
		assertEquals(321, solUnderTest.sol.reverse(123));
	}

	@Test
	@DisplayName("The reverse of the integer -123 is -321")
	public void testInput_3() {
		assertEquals(-321, solUnderTest.sol.reverse(-123));
	}

	@Test
	@DisplayName("The reverse of the integer 120 is 21")
	public void testInput_4() {
		assertEquals(21, solUnderTest.sol.reverse(120));
	}

	@Test
	@DisplayName("The reverse of the integer -2147483647 is 0")
	public void testInput_5() {
		assertEquals(0, solUnderTest.sol.reverse(-2147483647));
	}

	@Test
	@DisplayName("The reverse of the integer -2147483648 is 0")
	public void testInput_6() {
		assertEquals(0, solUnderTest.sol.reverse(-2147483648));
	}

	@Test
	@DisplayName("The reverse of the integer 2147483647 is 0")
	public void testInput_7() {
		assertEquals(0, solUnderTest.sol.reverse(2147483647));
	}
	
	@Test
	@DisplayName("The reverse of the integer 483647 is 746384")
	public void testInput_8() {
		assertEquals(746384, solUnderTest.sol.reverse(483647));
	}
}
