import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class EmptyLinkedListExceptionTest {
  @Test
  @DisplayName("Testing EmptyLinkedListException")
  void throwsException() {
    Throwable exception = assertThrows(EmptyLinkedListException.class, () -> {
      throw new EmptyLinkedListException("The list is empty");
    });
    assertEquals("The list is empty", exception.getMessage());
  }
}