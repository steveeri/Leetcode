package com.summerland.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.summerland.training.MergeKSortedLists;
import com.summerland.training.ListNode;

import junit.framework.TestCase;

@Testable
public class MergeKSortedListsTest extends TestCase {

  MergeKSortedLists solUnderTest = new MergeKSortedLists();

  @BeforeEach
  void setup() {
  }

  @AfterEach
  void cleanup() {
  }

  private void assertNonEmptyListIsAscendingAndStartsWithValueLowAndIsLengthX(ListNode list, int low, int x) {

    assertNotNull(list); // List should not be null
    assertEquals(low, list.val); // First item in list should be val = low

    var val = list.val;
    var nxt = list.next;
    var len = 1;

    // loop through list to verify list is ascending
    while (nxt != null) {
      assertTrue("Values should be ascending in list", nxt.val >= val);
      val = nxt.val;
      nxt = nxt.next;
      len++;
    }
    assertEquals(x, len); // should have 8 values in list
  }

  @Test
  @DisplayName("The result of merging lists: [[1,4,5],[1,3,4],[2,6]] is: [1,1,2,3,4,4,5,6]")
  public void testInput_1() {

    var list = new ListNode[3];
    list[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
    list[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
    list[2] = new ListNode(2, new ListNode(6));

    var res = solUnderTest.sol.mergeKLists(list);

    assertNotNull(res);
    assertEquals(1, res.val);
    assertNonEmptyListIsAscendingAndStartsWithValueLowAndIsLengthX(res, 1, 8);
  }

  @Test
  @DisplayName("The result of merging lists: [] is: null")
  public void testInput_2() {
    var res = solUnderTest.sol.mergeKLists(new ListNode[0]);
    assertNull(res);
  }

  @Test
  @DisplayName("The result of merging lists: [[]] is: null")
  public void testInput_3() {
    var list = new ListNode[1];
    list[0] = null;
    var res = solUnderTest.sol.mergeKLists(list);
    assertNull(res);
  }

}
