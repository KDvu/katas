import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {
  // Testing: constructor()
  @Test public void testConstructorWithNoArgsInitalisesHeadFieldToNull() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.head;
    assertNull(result);
  }

  @Test public void testConstructorWithNoArgsInitalisesTailFieldToNull() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.tail;
    assertNull(result);
  }

  // Testing: getHead()
  @Test public void testHeadFieldGetterShouldReturnNullAfterConstructorWithNoArgsIsCalled() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.getHead();
    assertNull(result);
  }

  // Testing: setHead()
  @Test public void testHeadFieldGetterShouldReturnANodeInstanceAfterTheHeadFieldSetterIsCalled() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(3);
    Node result = linkedList.setHead(node).getHead();
    assertThat(result, instanceOf(Node.class));
    assertEquals(3, result.getData());
  }

  // Testing: getTail()
  @Test public void testTailFieldGetterShouldReturnNullAfterConstructorWithNoArgsIsCalled() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.getTail();
    assertNull(result);
  }

  // Testing: setTail()
  @Test public void testTailFieldGetterShouldReturnANodeInstanceAfterTheTailFieldSetterIsCalled() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(5);
    Node result = linkedList.setTail(node).getTail();
    assertThat(result, instanceOf(Node.class));
    assertEquals(5, result.getData());
  }
}