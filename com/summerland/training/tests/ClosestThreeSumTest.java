package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.ClosestThreeSum;

import junit.framework.TestCase;

@Testable
public class ClosestThreeSumTest extends TestCase {

	ClosestThreeSum solUnderTest = new ClosestThreeSum();

	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("Using input [-1,2,1,-4] and target 3sum 1 => Result = 2 (-1+1+2). E.g. smallest offset = 1")
	public void testInput_1() {
		int[] data = new int[]{-1,2,1,-4};
		assertEquals(2, solUnderTest.sol.threeSumClosest(data, 1));
	}

	@Test
	@DisplayName("Using input [0,0,0] and target 3sum 1 => Result = 0 (0+0+0). E.g. smallest offset = 1")
	public void testInput_2() {
		int[] data = new int[]{0,0,0};
		assertEquals(0, solUnderTest.sol.threeSumClosest(data, 1));
	}

}
