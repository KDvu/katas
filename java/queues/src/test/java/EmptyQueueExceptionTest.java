import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class EmptyQueueExceptionTest {
  @Test
  @DisplayName("Testing EmptyQueueException")
  void throwsException() {
    Throwable exception = assertThrows(EmptyQueueException.class, () -> {
      throw new EmptyQueueException("The queue is empty");
    });
    assertEquals("The queue is empty", exception.getMessage());
  }
}