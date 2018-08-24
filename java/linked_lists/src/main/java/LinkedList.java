interface LinkedList<T> {
  T insertInFront(int num);
  T insertInEnd(int num);
  boolean contains(int num);
  T remove(int num);
  int getSize();
}