package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.RegExMatchingTabular;

import junit.framework.TestCase;

@Testable
public class RegExMatchingTabularTest extends TestCase {

	RegExMatchingTabular solUnderTest = new RegExMatchingTabular();
	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("The src string 'aa' is not matched by expression 'a'")
	public void testInput_1() {
		assertFalse(solUnderTest.sol.isMatch("aa", "a"));
	}

	@Test
	@DisplayName("The src string 'aa' is matched by expression 'a*'")
	public void testInput_2() {
		assertTrue(solUnderTest.sol.isMatch("aa", "a*"));
	}

	@Test
	@DisplayName("The src string 'ab' is matched by expression '.*'")
	public void testInput_3() {
		assertTrue(solUnderTest.sol.isMatch("ab", ".*"));
	}

	@Test
	@DisplayName("The src string 'abbacc' is matched by expression '.*c'")
	public void testInput_4() {
		assertTrue(solUnderTest.sol.isMatch("abbacc", ".*c"));
	}

	@Test
	@DisplayName("The src string 'abbaccd' is not matched by expression '.*c'")
	public void testInput_5() {
		assertFalse(solUnderTest.sol.isMatch("abbaccd", ".*c"));
	}

	@Test
	@DisplayName("The src string 'abbacc' is matched by expression 'ab.*c'")
	public void testInput_6() {
		assertTrue(solUnderTest.sol.isMatch("abbacc", "ab.*c"));
	}

	@Test
	@DisplayName("The src string 'abbacc' is not matched by expression 'abc.*c'")
	public void testInput_7() {
		assertFalse(solUnderTest.sol.isMatch("abbacc", "abc.*c"));
	}

	@Test
	@DisplayName("The src string 'abbacc' is matched by expression 'abbacc'")
	public void testInput_8() {
		assertTrue(solUnderTest.sol.isMatch("abbacc", "abbacc"));
	}

	@Test
	@DisplayName("The src string 'abbac' is not matched by expression 'abbacc'")
	public void testInput_9() {
		assertFalse(solUnderTest.sol.isMatch("abbac", "abbacc"));
	}

	@Test
	@DisplayName("The src string 'aabcbcbcaccbcaabc' is not matched by expression '.*a*aa*.*b*.c*.*a*'")
	public void testInput_10() {
		assertTrue(solUnderTest.sol.isMatch("aabcbcbcaccbcaabc", ".*a*aa*.*b*.c*.*a*"));
	}

}
