import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NodeTest {
  Tree binaryTree;

  @BeforeEach
  void init() {
    binaryTree = new Tree();
  }

  @Test
  @DisplayName("The contains method should return false after the tree is instantiated")
  void containsMethodShouldReturnFalse() {
    assertFalse(binaryTree.contains(10));
  }

  @Nested
  @DisplayName("After inserting an element")
  class AfterInserting{
    @BeforeEach
    void init() {
      binaryTree.add(10);
    }

    @Test
    @DisplayName("The contains method should return true after the add method is called to insert a new element")
    void containsShouldReturnTrue() {
      assertTrue(binaryTree.contains(10));
    }

    @Test
    @DisplayName("Inserting an element equal to the root value should incremnt the occurances field by 1")
    void shouldIncrementOccurrancesFieldBy1() {
      binaryTree.add(10);
      assertEquals(2, binaryTree.root.occurrences);
    }

    @Test
    @DisplayName("Inserting an element less than the root value should be inserted as the left child of the root node")
    void shouldAppendToTheLeftIfLessThan() {
      binaryTree.add(5);
      assertEquals(5, binaryTree.root.leftChild.value);
    }

    @Test
    @DisplayName("Inserting an element greater than the root value should be inserted as the right child of the root node")
    void shouldAppendToTheRightIfLessThan() {
      binaryTree.add(12);
      assertEquals(12, binaryTree.root.rightChild.value);
    }

    @Nested
    @DisplayName("After many elements have been isnerted")
    class AfterManyElementedInserted{
      @BeforeEach
      void init() {
        //The value 10 has already been added as the root value
        binaryTree.add(10); //Add another 10
        binaryTree.add(5);
        binaryTree.add(12);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(11);
        binaryTree.add(13);
      }

      @ParameterizedTest
      @ValueSource(ints = {10, 5, 12, 2, 3, 11, 13})
      @DisplayName("contains(int key) should return true for all values inserted")
      void containsShouldReturnTrue(int candidate){
        assertTrue(binaryTree.contains(candidate));
      }
      
      @Nested
      @DisplayName("After removing an element from the tree")
      class AfterRemovingElement {
        @ParameterizedTest
        @ValueSource(ints = {3, 11, 12, 13, 2, 5, 3, 10})
        @DisplayName("contains(int key) should return false after the value is removed")
        void containsShouldReturnFalse(int candidate){
          binaryTree.remove(candidate);
          assertFalse(binaryTree.contains(candidate));
        }
      }
    }
  }
}