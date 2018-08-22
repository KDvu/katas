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
}
