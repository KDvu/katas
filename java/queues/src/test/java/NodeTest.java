import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
  @DisplayName("After new node is instantiated with String")
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
}