public class SinglyLinkedList implements LinkedList {
  static class Node {
    private int num;
    private Node next;

    Node(int num){
      this.num = num;
      this.next = null;
    }

    public int getNum() { return this.num; }
    public Node getNext() { return this.next; }

    public void setNum(int newNum) { this.num = newNum; }
    public void setNext(Node newNext) { this.next = newNext; }
  }
  
  public Node node;

  // Constructor for an empty list
  SinglyLinkedList() {}

  // Constructor for a list with one element
  SinglyLinkedList(int firstNum) {
   this.node = new Node(firstNum);
  }

  public Node getNode() {
    return this.node;
  }

  public LinkedList sort(boolean asc) {
    return null;
  }

  public LinkedList remove(int num) {
    return null;
  }

  public LinkedList insertInFront(int num) {
    return null;
  }

  public LinkedList insertInEnd(int num) {
    return null;
  }
}