import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;

public class QueueTest {
  Queue<String> queue;
  
  @BeforeEach
  void init() {
    queue = new Queue<String>();
  }  

  @Nested
  @DisplayName("After instantiated")
  class AfterInstantiated {
    @Test
    @DisplayName("isEmpty() returns true")
    void isEmptyReturnsTrue() {
      assertTrue(queue.isEmpty());
    }

    @Test
    @DisplayName("peek() throws an EmptyQueueException")
    void peekThrowsEmptyQueueException() {
      assertThrows(EmptyQueueException.class, () -> {
        queue.peek();
      });
    }

    @Test
    @DisplayName("remove() throws an EmptyQueueException")
    void removeThrowsEmptyQueueException() {
      assertThrows(EmptyQueueException.class, () -> {
        queue.remove();
      });
    }

    @Nested
    @DisplayName("After add(T data)")
    class AfterAdd {
      private String firstData; 

      @BeforeEach
      void init() {
        firstData = "foo bar";
        queue.add(firstData);
      }

      @Test
      @DisplayName("isEmpty() returns false")
      void isEmptyReturnsFalse() {
        assertFalse(queue.isEmpty());
      }

      @Test
      @DisplayName("peek() returns the top of the queue")
      void peek() {
        try{
          assertEquals(this.firstData, queue.peek());   
        } catch (EmptyQueueException e) {
          fail("peek() threw an EmptyQueueException when it should have returned a string value");
        }
      }

      @Nested
      @DisplayName("After add(T add) is called again")
      class AfterAddAgain {
        private String secondData;

        @Test
        @DisplayName("peek() returns the top of the queue")
        void peek() {
          try{
            queue.add(secondData);
            assertEquals(firstData, queue.peek());   
          } catch (EmptyQueueException e) {
            fail("peek() threw an EmptyQueueException when it should have returned a string value");
          }
        }
      }

      @Nested
      @DisplayName("After remove() is called")
      class AfterRemove {
        @BeforeEach
        void init() {
          try {
            queue.remove();
          } catch (EmptyQueueException e) {}
        }

        @Test
        @DisplayName("isEmpty() returns true")
        void isEmptyReturnsTrue() {
          assertTrue(queue.isEmpty());
        }

        @Test
        @DisplayName("peek() throws an EmptyQueueException")
        void peekThrowsEmptyQueueException() {
          assertThrows(EmptyQueueException.class, () -> {
            queue.peek();
          });
        }
      }
    }
  }
}