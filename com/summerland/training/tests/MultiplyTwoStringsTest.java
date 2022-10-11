package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.MultiplyTwoStrings;

import junit.framework.TestCase;

@Testable
public class MultiplyTwoStringsTest extends TestCase {

	MultiplyTwoStrings solUnderTest = new MultiplyTwoStrings();
	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("Multiply two Zero strings should be 0")
	public void testInput_1() {
		assertEquals("0", solUnderTest.sol.multiply("0", "0"));
	}

	@Test
	@DisplayName("Multiply any non-zero string by zero should be 0")
	public void testInput_2() {
		assertEquals("0", solUnderTest.sol.multiply("3454525", "0"));
	}

	@Test
	@DisplayName("Multiply zero with any non-zero string should be 0")
	public void testInput_3() {
		assertEquals("0", solUnderTest.sol.multiply("0", "45"));
	}

	@Test
	@DisplayName("Multiply  Strings 1 and 1 should be 1")
	public void testInput_4() {
		assertEquals("1", solUnderTest.sol.multiply("1", "1"));
	}

	@Test
	@DisplayName("Multiply  Strings 2 and 2 should be 4")
	public void testInput_5() {
		assertEquals("4", solUnderTest.sol.multiply("2", "2"));
	}

	@Test
	@DisplayName("Multiply  Strings 1 and 10 should be 10")
	public void testInput_6() {
		assertEquals("10", solUnderTest.sol.multiply("1", "10"));
	}

	@Test
	@DisplayName("Multiply  Strings 2 and 11 should be 22")
	public void testInput_7() {
		assertEquals("22", solUnderTest.sol.multiply("2", "11"));
	}

	@Test
	@DisplayName("Multiply  Strings 123 and 4567 should be 561741")
	public void testInput_8() {
		assertEquals("561741", solUnderTest.sol.multiply("123", "4567"));
	}

	@Test
	@DisplayName("Multiply  Strings 123 and 456 should be 56088")
	public void testInput_9() {
		assertEquals("56088", solUnderTest.sol.multiply("123", "456"));
	}

	@Test
	@DisplayName("Multiply  Strings 123 and 4567 should be 561741")
	public void testInput_10() {
		assertEquals("561741", solUnderTest.sol.multiply("4567", "123"));
	}

	@Test
	@DisplayName("Multiply  Strings 1000000 and 1000000 should be 1000000000000")
	public void testInput_11() {
		assertEquals("1000000000000", solUnderTest.sol.multiply("1000000", "1000000"));
	}

	@Test
	@DisplayName("Multiply  Strings 10 and 1000000 should be 1000000")
	public void testInput_12() {
		assertEquals("10000000", solUnderTest.sol.multiply("10", "1000000"));
	}
}
