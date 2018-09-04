import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;

class NodeTest {
  Tree binaryTree;

  @BeforeEach
  void init() {
    binaryTree = new Tree();
  }

  @Test
  @DisplayName("Testing finding an element with the contains method")
  void containsMethodShouldReturnFalse() {
    assertFalse(binaryTree.contains());
  }

  @Nested
  @DisplayName("After inserting an element")
  class AfterInserting{
    @BeforeEach
    void init() {
      binaryTree.add(1);
    }
  }
}