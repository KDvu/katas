public class SinglyLinkedList {
  public Node head;
  public Node tail;

  SinglyLinkedList() {
    head = null;
    tail = null;
  }

  public Node getHead() { return this.head; }
  
  public SinglyLinkedList setHead(Node node) {
    this.head = node;
    return this;
  }

  public Node getTail() { return this.tail; }

  public SinglyLinkedList setTail(Node node) {
    this.tail = node;
    return this;
  }
}