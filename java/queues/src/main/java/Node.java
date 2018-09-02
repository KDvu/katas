public class Node<T extends Comparable<T>> {
  private Node<T> next;
  private Node<T> prev;
  private T data;

  Node() {
    this.next = null;
    this.prev = null;
  }

  Node(T data) {
    this.next = null;
    this.prev = null;
    this.data = data;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public Node<T> getPrev() {
    return this.prev;
  }

  public T getData() {
    return this.data;
  }
}