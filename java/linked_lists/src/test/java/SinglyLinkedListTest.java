import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

  // Testing: Constructor (no parameters) 
 @Test public void testInitialNodeIsNull() {
  SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
  assertNull(singlyLinkedList.head);
 }

 @Test public void testInitialSizeIs0() {
  SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
  assertEquals(0, singlyLinkedList.getSize());
 }

 // Testing: Constructor (1 parameter)
 @Test public void testInitialNodeIsNotNull() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(4);
    assertNotNull(singlyLinkedList.head);
  }

  @Test public void testInitialSizeIs1() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
    assertEquals(1, singlyLinkedList.getSize());  
  }

  @Test public void testInitialNodeNumberIs4() {
    int expectedNum = 4;
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(expectedNum);
    int result = singlyLinkedList.head.getNum();

    assertEquals(expectedNum, result);
  }

  @Test public void testInitialNodeNumberIs15() {
    int expectedNum = 15;
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(expectedNum);
    int result = singlyLinkedList.head.getNum();

    assertEquals(expectedNum, result);
  }

  // Testing: getSize()
  @Test public void testGetSizeShouldReturn0() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    int result = singlyLinkedList.getSize();
    assertEquals(0, result);
  }

  @Test public void testGetSizeShouldReturn1() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(2);
    int result = singlyLinkedList.getSize();
    assertEquals(1, result);
  }

  // Testing: printAll()
  @Test(expected = IllegalStateException.class) public void testPrintAllWhenTheListIsEmptyShouldThrowError() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.printAll();
  }

  // Testing: printAll()
  @Test public void testPrintAllShouldPrint1() {
    String expectedResult = "1";
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(1);
    String result = singlyLinkedList.printAll();
    assertEquals(expectedResult, result);
  }

  // Testing: insertInFront(int num)
  @Test public void testShouldInsertANewNodeWithNumber7InFront() {
    SinglyLinkedList oldSinglyLinkedList = new SinglyLinkedList(7);
    SinglyLinkedList newSinglyLinkedList = oldSinglyLinkedList.insertInFront(5);

    // Testing immutability characteristic 
    assertEquals("7", oldSinglyLinkedList.printAll());
    assertEquals("5 7", newSinglyLinkedList.printAll());
  }

  // Testing: insertInEnd(int num)
  @Test public void testShouldInsertANodeWithNumber3InEndToAEmptyList() {
    SinglyLinkedList oldSinglyLinkedList = new SinglyLinkedList();
    SinglyLinkedList newSinglyLinkedList = oldSinglyLinkedList.insertInEnd(3);

    assertEquals("3", newSinglyLinkedList.printAll());
  }

  @Test public void testShouldInsertANodeWithNumber5InEndWithOneElementInTheList() {
    SinglyLinkedList oldSinglyLinkedList = new SinglyLinkedList(10);
    SinglyLinkedList newSinglyLinkedList = oldSinglyLinkedList.insertInEnd(5);

    // Testing immutability characteristic 
    assertEquals("10", oldSinglyLinkedList.printAll());
    assertEquals("10 5", newSinglyLinkedList.printAll());
  }

  // Testing: contains(int num)
  @Test public void testShouldReturnFalseIfTheListIsEmpty() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    assertFalse(singlyLinkedList.contains(2));
  }

  @Test public void testShouldReturnFalseIfThe7IsNotInTheList() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(4);

    assertFalse(singlyLinkedList.contains(7));
  }

  @Test public void testShouldReturnTrueIf7IsInTheListWith1Element() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(7);

    assertTrue(singlyLinkedList.contains(7));

  }

  @Test public void testShouldReturnTrueIf10IsInTheListWith3Elements() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(3);
    singlyLinkedList = singlyLinkedList.insertInEnd(10);
    singlyLinkedList = singlyLinkedList.insertInEnd(1);

    assertTrue(singlyLinkedList.contains(10));

  }
}