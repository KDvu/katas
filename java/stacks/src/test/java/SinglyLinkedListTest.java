import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {
  // Testing: constructor()
  @Test public void testConstructorWithNoArgsInitalisesHeadFieldToNull() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.getHead();
    assertNull(result);
  }

  @Test public void testConstructorWithNoArgsInitalisesTailFieldToNull() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node result = linkedList.getHead();
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

  // Testing: size()
  @Test public void testShouldReturn0IfTheListIsEmpty() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    int result = linkedList.size();
    assertEquals(0, result);
  }

  // Testing: addFirst(Node node)
  @Test public void testShouldReturnASizeOf1AfterAddFirstIsCalledWithAEmptyList() {
    int expectedSize = 1;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(7);
    linkedList.addFirst(node);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testShouldReturnASizeOf2AfterAddFirstIsCalledWithAEmptyList() {
    int expectedSize = 2;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node initialNode = new Node(3);
    linkedList.addFirst(initialNode);

    Node node = new Node(7);
    linkedList.addFirst(node);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testHeadFieldShouldBeTheNewAddedNode() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node initialHead = new Node(2);
    linkedList.addFirst(initialHead);

    Node addedNode = new Node(4);
    linkedList.addFirst(addedNode);

    Node result = linkedList.getHead();
    assertThat(result, instanceOf(Node.class));
    assertEquals(4, result.getData());
  }

  @Test public void testTailFieldShouldReferToTheSameNodeObjectAsTheHeadFieldIfAddFirstIsCalledOnAnEmptyLinkedList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(7);
    linkedList.addFirst(node);
    assertEquals(linkedList.getHead(), linkedList.getTail());
  }

  // Testing: addLast(Node node)
  @Test public void testShouldReturnSizeOf1AfterAddLastIsCalledWithEmptyList() {
    int expectedSize = 1;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(2);
    linkedList.addLast(node);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testShouldReturnSizeOf2AfterAddLastIsCalledOnAListWith1Element() {
    int expectedSize = 2;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node initialNode = new Node(5);
    linkedList.addFirst(initialNode);

    Node addedNode = new Node(2);
    linkedList.addLast(addedNode);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testTailFieldShouldBeTheNewAddedNodeWhenAddLastIsCalledOnAnEmptyList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(4);
    linkedList.addLast(node);

    Node result = linkedList.getTail();
    assertThat(result, instanceOf(Node.class));
    assertEquals(4, result.getData());
  }

  @Test public void testHeadFieldShouldReferToTheSameNodeObjectAsTheTailFieldIfAddLastIsCalledOnAnEmptyLinkedList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    Node node = new Node(4);
    linkedList.addLast(node);

    assertEquals(linkedList.getHead(), linkedList.getTail());
  }
}