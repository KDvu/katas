import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NodeTest {
  // Testing constructor: Node(int data)
  @Test public void testConstructorInitialisesDataFieldTo5WhenGiven5AsArg() {
    int expectedResult = 5;
    Node node = new Node(5);    
    int result = node.getData();
    assertEquals(expectedResult, result);
  }

  @Test public void testConstructorInitialisesDataFieldTo12WhenGiven12AsArg() {
    int expectedResult = 12;
    Node node = new Node(12);    
    int result = node.getData();
    assertEquals(expectedResult, result);
  }

  @Test public void testConstructorInitialisesNextFieldToNull() {
    Node node = new Node(1);
    Node result = node.getNext();
    assertNull(result);
  }

  // Testing method: getData()
  @Test public void testDataFieldGetterShouldReturn4WhenNodeIsInitialisedWith4AsArg() {
    int expectedResult = 4;
    Node node = new Node(4);    
    int result = node.getData();
    assertEquals(expectedResult, result);
  }

  @Test public void testDataFieldGetterShouldReturn2WhenNodeIsInitialisedWith2AsArg() {
    int expectedResult = 2;
    Node node = new Node(2);    
    int result = node.getData();
    assertEquals(expectedResult, result);
  }

  // Testing method: setData(int newData)
  @Test public void testDataFieldGetterShouldReturn10AfterSetterIsCalledArg10() {
    int expectedResult = 10;
    Node node = new Node(1);
    node.setData(expectedResult);
    int result = node.getData();
    assertEquals(expectedResult, result);
  }  

  @Test public void testDataFieldGetterShouldReturn2AfterSetterIsCalledArg2() {
    int expectedResult = 2;
    Node node = new Node(20);
    node.setData(expectedResult);
    int result = node.getData();
    assertEquals(expectedResult, result);
  }  

  // Testing method: getNext()
  @Test public void testNextFieldGetterShouldReturnNull() {
    Node node = new Node(1);
    Node result = node.getNext();
    assertNull(result);
  }

  // Testing method: setNext(Node newNode) 
  @Test public void testNextFieldGetterShouldReturnANodeObjectSetToIt() {
    Node node = new Node(1);
    Node node2 = new Node(2);

    node.setNext(node2);
    assertThat(node.getNext(), instanceOf(Node.class));
    assertEquals(2, node.getNext().getData());
  }
}