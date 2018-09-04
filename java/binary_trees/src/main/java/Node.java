public class Node {
  public int value;
  public Node leftChild;
  public Node rightChild;

  Node() {
    this.value = 0;
    this.leftChild = null;
    this.rightChild = null;
  }

  Node(int val) {
    this.value = val;
    this.leftChild = null;
    this.rightChild = null;
  }
}