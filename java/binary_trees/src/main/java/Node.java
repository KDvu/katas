public class Node {
  public int value;
  public int occurrences;
  public Node leftChild;
  public Node rightChild;

  Node() {
    this.value = 0;
    this.occurrences = 0;
    this.leftChild = null;
    this.rightChild = null;
  }

  Node(int val) {
    this.value = val;
    this.occurrences = 1;
    this.leftChild = null;
    this.rightChild = null;
  }
}