package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.BinaryWatch;

import junit.framework.TestCase;

@Testable
public class BinaryWatchTest extends TestCase {

	BinaryWatch solUnderTest = new BinaryWatch();
	
	@BeforeEach
	void setup() {
	}

	@AfterEach
	void cleanup() {
	}
	
	@Test
	@DisplayName("Zero number of LED's =>  time = '0:00'")
	public void testInput_1() {
		assertEquals("0:00", solUnderTest.sol.readBinaryWatch(0).get(0));
	}	
    
    @Test
	@DisplayName("9 number of LED's =>  time = undefined empty array []")
	public void testInput_2() {
		assertEquals(0, solUnderTest.sol.readBinaryWatch(9).size());
	}

    @Test
	@DisplayName("1 number of LED's =>  time = array of 10 time values []")
	public void testInput_4() {
		assertEquals(10, solUnderTest.sol.readBinaryWatch(1).size());
		assertEquals("0:08", solUnderTest.sol.readBinaryWatch(1).get(3));
	}

}