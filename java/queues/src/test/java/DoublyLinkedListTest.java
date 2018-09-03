import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

class DoublyLinkedListTest {

  @Test
  @DisplayName("is instantiated with new DoublyLinkedList<String>()")
  void testNodeIsInstantiatedWithInteger() {
    DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
  }

  @Test
  @DisplayName("RemoveFirst on a empty list throws an EmptyLinkedListException")
  void removeFirstThrowsEmptyLinkedListException() {
    DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
    assertThrows(EmptyLinkedListException.class, () -> {
      doublyLinkedList.removeFirst();
    });
  }

  @Nested
  @DisplayName("After instantiated as new DoublyLinkedList<String>()")
  class AfterInstantiated {
    DoublyLinkedList<String> doublyLinkedList;

    @BeforeEach
    void init() {
      doublyLinkedList = new DoublyLinkedList<String>();
    }

    @Test
    @DisplayName("Head field is initialised to null")
    void headGetterShouldReturnNull() {
      assertNull(doublyLinkedList.getHead());
    }

    @Test
    @DisplayName("Tail field is initialised to null")
    void prevGetterShouldReturnNull() {
      assertNull(doublyLinkedList.getTail());
    }

    @Test
    @DisplayName("isEmpty() should return true")
    void isEmptyMethodShouldReturnTrue() {
      assertTrue(doublyLinkedList.isEmpty());
    }
  } 

  @Nested
  @DisplayName("After addLast(String str) is called on empty list")
  class AfterAddLast {
    DoublyLinkedList<String> doublyLinkedList;
    String strData;

    @BeforeEach
    void init() {
      doublyLinkedList = new DoublyLinkedList<String>();
      strData = "Hello world";
      doublyLinkedList.addLast(strData);
    }

    @Test
    @DisplayName("Head field is not null")
    void headFieldIsNotNull() {
      assertNotNull(doublyLinkedList.getHead());
    }

    @Test
    @DisplayName("Tail field is not null")
    void tailFieldIsNotNull() {
      assertNotNull(doublyLinkedList.getHead());
    }

    @Test
    @DisplayName("Head and tail field point to the same object")
    void headObjEqualTailObj() {
      assertSame(doublyLinkedList.getHead(), doublyLinkedList.getTail());
    }

    @Test
    @DisplayName("isEmpty() returns false") 
    void isEmptyReturnsFalse() {
      assertFalse(doublyLinkedList.isEmpty());
    }

    @Nested
    @DisplayName("After removeFirst() is called")
    public class AfterRemoveFirst {
      @BeforeEach
      void init() {
        try{
          doublyLinkedList.removeFirst();
        } catch (EmptyLinkedListException e) {}
      }

      @Test
      @DisplayName("isEmpty() returns true")
      void isEmptyReturnsTrue() {
        assertTrue(doublyLinkedList.isEmpty());
      }

      @Test
      @DisplayName("Head field is null")
      void headGetterReturnsNull() {
        assertNull(doublyLinkedList.getHead());
      }

      @Test
      @DisplayName("Tail field is null")
      void tailGetterReturnsNull() {
        assertNull(doublyLinkedList.getTail());
      }
    }
  }
}
