package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.RemoveDuplicatesFromSortedArray;

import junit.framework.TestCase;

@Testable
public class RemoveDuplicatesFromSortedArrayTest extends TestCase {

	RemoveDuplicatesFromSortedArray solUnderTest = new RemoveDuplicatesFromSortedArray();
	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("Converted zigzag text should be 'paypalishiring'")
	public void testInput_1() {
		int[] data = new int[]{7};
		assertEquals(1, solUnderTest.sol.removeDuplicates(data));
	}

}
