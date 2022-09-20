package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.ContainsMostWater;

import junit.framework.TestCase;

@Testable
public class ContainsMostWaterTest extends TestCase {

	ContainsMostWater solUnderTest = new ContainsMostWater();
	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}

	@Test
	@DisplayName("Contains water should be 49")
	public void testInput_1() {
		int[] data = new int[]{0,0};
		assertEquals(0, solUnderTest.sol.maxArea(data));
	}
	
	@Test
	@DisplayName("Contains water should be 1")
	public void testInput_2() {
		int[] data = new int[]{1,1};
		assertEquals(1, solUnderTest.sol.maxArea(data));
	}
	
	@Test
	@DisplayName("Contains water should be 49")
	public void testInput_3() {
		int[] data = new int[]{1,8,6,2,5,4,8,3,7};
		assertEquals(49, solUnderTest.sol.maxArea(data));
	}
	
	@Test
	@DisplayName("Contains water should be 1")
	public void testInput_4() {
		int[] data = new int[]{7,1,5,6,5,2};
		assertEquals(20, solUnderTest.sol.maxArea(data));
	}

	@Test
	@DisplayName("Contains water should be 1")
	public void testInput_5() {
		int[] data = new int[]{4,5,5,6,5,90,80,11,5,4,2,1};
		assertEquals(80, solUnderTest.sol.maxArea(data));
	}
}
