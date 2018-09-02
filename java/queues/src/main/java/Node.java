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

  public Node<T> setNext(Node<T> node) {
    this.next = node;
    return this;
  }

  public Node<T> getPrev() {
    return this.prev;
  }

  public Node<T> setPrev(Node<T> node) {
    this.prev = node;
    return this;
  }

  public T getData() {
    return this.data;
  }
}