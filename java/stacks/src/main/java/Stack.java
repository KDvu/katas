public class Stack {
  SinglyLinkedList list;

  Stack() {
    this.list = new SinglyLinkedList();
  }

  public boolean isEmpty() {
    return this.list.size() == 0? true : false;
  }

  public void push(int data) {
    this.list.addFirst(data);
  }

  public int peek() {
    return this.list.getHead().getData();
  }

  public int pop() throws EmptyStackException {
    int data = this.list.getHead().getData();
    try {
      this.list.removeFirst();
    } catch (EmptyLinkedListException e) {
      throw new EmptyStackException("The stack is empty");
    }
    return data;
  }
}