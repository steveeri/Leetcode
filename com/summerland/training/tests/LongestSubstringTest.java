package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.LongestSubstring;

import junit.framework.TestCase;

@Testable
public class LongestSubstringTest extends TestCase {

	LongestSubstring longestSubstring = new LongestSubstring();
	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}

	@Test
	@DisplayName("Longest substring in 'abcabcbb' should be 3")
	public void testInput_1() {
		assertEquals(3, longestSubstring.sol.lengthOfLongestSubstring("abcabcbb"));
	}
	
	@Test
	@DisplayName("Longest substring in 'bbbbb' should be 1")
	public void testInput_2() {
		assertEquals(1, longestSubstring.sol.lengthOfLongestSubstring("bbbbb"));
	}
	
	@Test
	@DisplayName("Longest substring in 'pwwkew' should be 3")
	public void testInput_3() {
		assertEquals(3, longestSubstring.sol.lengthOfLongestSubstring("pwwkew"));
	}
	@Test
	
	@DisplayName("Longest substring in 'dvdf' should be 3")
	public void testInput_4() {
		assertEquals(3, longestSubstring.sol.lengthOfLongestSubstring("dvdf"));
	}
}
