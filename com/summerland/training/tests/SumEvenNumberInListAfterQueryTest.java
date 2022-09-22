package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.SumEvenNumberInListAfterQuery;

import junit.framework.TestCase;

@Testable
public class SumEvenNumberInListAfterQueryTest extends TestCase {

	SumEvenNumberInListAfterQuery solUnderTest = new SumEvenNumberInListAfterQuery();

	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("The sum of even numbers following each query [[1,0],[-3,1],[-4,0],[2,3]] combined applied to [1,2,3,4] is [8,6,2,4]")
	public void testInput_1() {
		int[] res = solUnderTest.sol.sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][]{new int[]{1,0},new int[]{-3,1},new int[]{-4,0},new int[]{2,3}});
		assertTrue("Result should be array of lenth 4", res.length == 4);
		assertEquals(8, res[0]);
		assertEquals(6, res[1]);
		assertEquals(2, res[2]);
		assertEquals(4, res[3]);
	}

	@Test
	@DisplayName("The sum of even numbers following each query [[4,0]] combined applied to [1] is [0]")
	public void testInput_2() {
		int[] res = solUnderTest.sol.sumEvenAfterQueries(new int[]{1}, new int[][]{new int[]{4,0}});
		assertTrue("Result should be array of length 1", res.length == 1);
		assertEquals(0, res[0]);
	}
}
