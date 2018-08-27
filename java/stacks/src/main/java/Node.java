public class Node {
  private Node next;
  private int data;

  Node(int data) {
    this.next = null;
    this.data = data;
  }

  // Getters and Setters
  public int getData() {
    return this.data;
  }

  public Node setData(int newData) {
    this.data = newData;
    return this;
  }

  public Node getNext() {
    return this.next;
  }

  public Node setNext(Node newNode) {
    this.next = newNode;
    return this;
  }
}