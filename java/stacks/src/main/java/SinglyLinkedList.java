public class SinglyLinkedList {
  private Node head;
  private Node tail;

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

  public int size() { 
    int size = 0;

    for(Node ptr = this.head; ptr != null; ptr = ptr.getNext()) 
      size++;

    return size;
  }

  public void addFirst(int data) {
    Node node = new Node(data);
    
    if(this.head == null)  {
      this.head = node;
      this.tail = this.head;
    } else {
      node.setNext(this.head);
      this.head = node;
    }
  }

  public void addLast(int data) {
    Node node = new Node(data);

    if(this.tail == null) {
      this.tail = node;
      this.head = this.tail;
    } else {
      this.tail.setNext(node);
      this.tail = node;
    }
  }

  public void removeFirst() throws EmptyLinkedListException{
    if(this.head == null) { throw new EmptyLinkedListException(); } 
    this.head = this.head.getNext();
  }
}