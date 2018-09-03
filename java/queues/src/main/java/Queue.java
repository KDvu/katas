public class Queue<T extends Comparable<T>> {
  DoublyLinkedList<T> linkedList;

  Queue() {
    linkedList = new DoublyLinkedList<T>();
  }

  public boolean isEmpty() {
    return linkedList.isEmpty();
  }

  public T peek() throws EmptyQueueException {
    if(isEmpty())
      throw new EmptyQueueException("peek() cannot be called on an empty queue");
    else {
      T data = this.linkedList.getHead().getData();
      return data;
    }
  }

  public void add(T data) {
    linkedList.addLast(data);
  }

  public void remove() throws EmptyQueueException {
    try {
      linkedList.removeFirst();
    } catch(EmptyLinkedListException e) {
      throw new EmptyQueueException("remove() cannot be called on an empty queue");
    }
  }
}