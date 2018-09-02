public class DoublyLinkedList<T extends Comparable<T>> {
  private Node<T> head;
  private Node<T> tail;

  DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public Node<T> getHead() {
    return this.head;
  }

  public Node<T> getTail() {
    return this.tail;
  }

  public boolean isEmpty() {
    return this.head == null? true : false;
  }

  public void addLast(T data) {
    Node<T> node = new Node<T>(data);
    if(this.head == null) {
      this.head = this.tail = node;
    } else {
      this.tail.setNext(node);
      this.tail = this.tail.getNext();
    }
  }

  public void removeFirst() throws EmptyLinkedListException {
    if(this.head == null) 
      throw new EmptyLinkedListException("The linked list is empty");

    if(this.head.equals(this.tail)) {
      this.head = this.tail = null;
    } else {
      this.head = this.head.getNext();
    }    
  }
}