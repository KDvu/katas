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
    linkedList.addFirst(7);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testShouldReturnASizeOf2AfterAddFirstIsCalledWithAEmptyList() {
    int expectedSize = 2;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(3);

    linkedList.addFirst(7);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testHeadFieldShouldBeTheNewAddedNode() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(2);
    linkedList.addFirst(4);

    Node result = linkedList.getHead();
    assertThat(result, instanceOf(Node.class));
    assertEquals(4, result.getData());
  }

  @Test public void testTailFieldShouldReferToTheSameNodeObjectAsTheHeadFieldIfAddFirstIsCalledOnAnEmptyLinkedList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(7);
    assertEquals(linkedList.getHead(), linkedList.getTail());
  }

  // Testing: addLast(Node node)
  @Test public void testShouldReturnSizeOf1AfterAddLastIsCalledWithEmptyList() {
    int expectedSize = 1;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addLast(2);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testShouldReturnSizeOf2AfterAddLastIsCalledOnAListWith1Element() {
    int expectedSize = 2;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(5);
    linkedList.addLast(2);
    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testTailFieldShouldBeTheNewAddedNodeWhenAddLastIsCalledOnAnEmptyList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addLast(4);

    Node result = linkedList.getTail();
    assertThat(result, instanceOf(Node.class));
    assertEquals(4, result.getData());
  }

  @Test public void testHeadFieldShouldReferToTheSameNodeObjectAsTheTailFieldIfAddLastIsCalledOnAnEmptyLinkedList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addLast(4);

    assertEquals(linkedList.getHead(), linkedList.getTail());
  }

  // Testing RemoveFirst()
  @Test public void testShouldThrowEmptyLinkedListExceptionWhenRemoveFirstIsCalledWhenTheListIsEmpty() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    try {
      linkedList.removeFirst();
      fail("Expected EmptyLinkedListException when removeFirst() is called when the list is empty.");
    } catch(EmptyLinkedListException e) {
      //Test passed
    }
  }

  @Test public void testSizeShouldBe0WhenTheOnlyElementInTheListIsRemoved() {
    int expectedSize = 0;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(3);
    try {
      linkedList.removeFirst();
    } catch(EmptyLinkedListException e) {
      fail("EmptyLinkedListException was thrown when an element should have been removed.");
    }

    int result = linkedList.size();
    assertEquals(expectedSize, result);
  }

  @Test public void testSizeShouldBe1WhenRemoveFirstIsCalledWhenThereAreTwoElementsInTheList() {
    int expectedSize = 1;
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.addFirst(3);

    linkedList.addFirst(4);

    try {
      linkedList.removeFirst();
    } catch(EmptyLinkedListException e) {
      fail("EmptyLinkedListException was thrown when an element should have been removed.");
    }

    int result = linkedList.size();
    assertEquals(expectedSize, result);
    assertEquals(3, linkedList.getHead().getData());
  }
}