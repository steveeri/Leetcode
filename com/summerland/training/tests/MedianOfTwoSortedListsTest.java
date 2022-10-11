package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.MedianOfTwoSortedLists;

import junit.framework.TestCase;

@Testable
public class MedianOfTwoSortedListsTest extends TestCase {

	MedianOfTwoSortedLists solUnderTest = new MedianOfTwoSortedLists();

	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("The median of [0] & [0] is 0.00000")
	public void testInput_1() {
		assertEquals(0.00000d, solUnderTest.sol.findMedianSortedArrays(new int[]{0}, new int[]{0}));
	}

	@Test
	@DisplayName("The median of [1,3] & [2] is 2.00000")
	public void testInput_2() {
		assertEquals(2.00000d, solUnderTest.sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
	}
	
	@Test
	@DisplayName("The median of [1,2] & [3,4] is 2.50000")
	public void testInput_3() {
		assertEquals(2.50000d, solUnderTest.sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
	}
	
	@Test
	@DisplayName("The median of [] & [5] is 5.00000")
	public void testInput_4() {
		assertEquals(5.00000d, solUnderTest.sol.findMedianSortedArrays(new int[]{}, new int[]{5}));
	}

	@Test
	@DisplayName("The median of [1,4] & [] is 2.50000")
	public void testInput_5() {
		assertEquals(2.50000d, solUnderTest.sol.findMedianSortedArrays(new int[]{1,4}, new int[]{}));
	}

	@Test
	@DisplayName("The median of [1,4,6] & [] is 4.00000")
	public void testInput_6() {
		assertEquals(4.00000d, solUnderTest.sol.findMedianSortedArrays(new int[]{1,4,6}, new int[]{}));
	}

}
