package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.ListNode;
import com.summerland.training.RemoveNthNodeFromLinkedList;

import junit.framework.TestCase;

@Testable
public class RemoveNthNodeFromLinkedListTest extends TestCase {

	RemoveNthNodeFromLinkedList solUnderTest = new RemoveNthNodeFromLinkedList();
	
	@BeforeEach
	void setup() {
		// TODO document why this method is empty
	}

	@AfterEach
	void clenup() {
		// TODO document why this method is empty
	}
	
	@Test
	@DisplayName("Zero number of LED's =>  time = '0:00'")
	public void testInput_1() {
		var head = new ListNode(1);
		assertNull(solUnderTest.sol.removeNthFromEnd(head, 1));
	}

	@Test
	@DisplayName("Zero number of LED's =>  time = '0:00'")
	public void testInput_2() {
		var head = new ListNode(5);
		head = new ListNode(4, head);
		head = new ListNode(3, head);
		head = new ListNode(2, head);
		head = new ListNode(1, head);
		assertEquals(head, solUnderTest.sol.removeNthFromEnd(head, 2));
	}
}