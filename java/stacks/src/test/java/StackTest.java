import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
  // Testing: isEmpty()
  @Test public void testIsEmptyShouldReturnTrue() {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  } 

  // Testing: push(int data)
  @Test public void testIsEmptyShouldReturnFalseAfterThePushMethodIsCalled() {
    Stack stack = new Stack();
    int data = 2;
    stack.push(data);
    assertFalse(stack.isEmpty());
  }

  // Testing: peek(int data)
  @Test public void testPeekShouldReturnTheLastAddedNumber() {
    Stack stack = new Stack();
    int data = 2;
    stack.push(data);
    int result = stack.peek();
    assertEquals(2, result);
  }

  @Test public void testIsEmptyShouldReturnFalseAfterPeekIsCalled() {
    Stack stack = new Stack();
    int data = 2;
    stack.push(data);
    stack.peek();
    assertFalse(stack.isEmpty());
  }

  // Testing: isEmpty()
  @Test public void testPopShouldReturnTheLastAddedNumber() {
    Stack stack = new Stack();
    int data = 4;
    stack.push(data);

    try {
      int result = stack.pop();
      assertEquals(4, result);
    } catch(EmptyStackException e) {
      fail("An EmptyStackException was thrown when 4 should have been returned.");
    }
  }

  @Test public void testIsEmptyShouldReturnTrueAfterPopIsCalled() {
    Stack stack = new Stack();
    int data = 2;
    stack.push(data);
    try {
      stack.pop();
      assertTrue(stack.isEmpty());
    } catch(EmptyStackException e) {
      fail("An EmptyStackException was thrown when pop() was called.");
    }
  }
}