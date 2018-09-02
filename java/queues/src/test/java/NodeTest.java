import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NodeTest {

  @Test
  @DisplayName("is instantiated with new Node<String>()")
  void testNodeIsInstantiatedWithInteger(TestInfo testInfo) {
    Node<String> node = new Node<String>();
  }

  @ParameterizedTest
  @ValueSource(strings = {"Kevin", "Lucy", "Anna", "David"})
  @DisplayName("Data field getter returns arg passed to constructor call") 
  void dataGetterReturnsArgPassedToConstructorCall(String candidate) {
    Node<String> node = new Node<String>(candidate);
    assertEquals(candidate, node.getData());
  }

  @Nested
  @DisplayName("After new node is instantiated as a String type with no args")
  class AfterInstantiated{
    Node<String> node;

    @BeforeEach
    void init() {    
      node = new Node<String>();
    }  

    @Test
    @DisplayName("Next field getter returns null")
    void nextGetterReturnsNull() {
      assertNull(node.getNext());
    }

    @Test
    @DisplayName("Prev field getter returns null")
    void prevGetterReturnsNull() {
      assertNull(node.getPrev());
    }
  }
  
  @Nested
  @DisplayName("After next field setter method is called")
  class AfterNextIsSet{
    Node<String> node;
    Node<String> newNode;
    String str;

    @BeforeEach
    void init() {    
      this.str = "String value";

      node = new Node<String>();
      newNode = new Node<String>(this.str);
      node.setNext(newNode);
    }  

    @Test
    @DisplayName("getNext() returns an instance of Node<String>")
    void returnsNodeStringInstance() {
      assertSame(node.getNext(), newNode);
    }
  }

  @Nested
  @DisplayName("After prev field setter method is called")
  class AfterPrevIsSet{
    Node<String> node;
    Node<String> newNode;
    String str;

    @BeforeEach
    void init() {    
      this.str = "Hello, world";

      node = new Node<String>();
      newNode = new Node<String>(this.str);
      node.setPrev(newNode);
    }  

    @Test
    @DisplayName("getNext() returns an instance of Node<String>")
    void returnsNodeStringInstance() {
      assertSame(node.getPrev(), newNode);
    }
  }
}