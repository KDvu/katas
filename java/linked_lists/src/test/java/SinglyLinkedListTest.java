import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

  // Testing: Constructor (no parameters) 
 @Test public void testInitialNodeIsNull() {
  SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
  assertNull(singlyLinkedList.node);
 }

 // Testing: Constructor (1 parameter)
 @Test public void testInitialNodeIsNotNull() {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(4);
    assertNotNull(singlyLinkedList.node);
  }

  @Test public void testInitialNodeNumberIs4() {
    int expectedNum = 4;
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(expectedNum);
    int result = singlyLinkedList.node.getNum();

    assertEquals(expectedNum, result);
  }

  @Test public void testInitialNodeNumberIs15() {
    int expectedNum = 15;
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(expectedNum);
    int result = singlyLinkedList.node.getNum();

    assertEquals(expectedNum, result);
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
}