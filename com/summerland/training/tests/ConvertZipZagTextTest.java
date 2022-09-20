package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.ConvertZipZagText;

import junit.framework.TestCase;

@Testable
public class ConvertZipZagTextTest extends TestCase {

	ConvertZipZagText solUnderTest = new ConvertZipZagText();
	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("ZigZagged string 'PAYPALISHIRING' over 3 rows should equal 'PAHNAPLSIIGYIR")
	public void testInput_1() {
		assertEquals("PAHNAPLSIIGYIR", solUnderTest.sol.convert("PAYPALISHIRING", 3));
	}

	@Test
	@DisplayName("ZigZagged string 'PAYPALISHIRING' over 4 rows should equal 'PINALSIGYAHRPI")
	public void testInput_2() {
		assertEquals("PINALSIGYAHRPI", solUnderTest.sol.convert("PAYPALISHIRING", 4));
	}

}
