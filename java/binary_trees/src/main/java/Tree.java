public class Tree {
  public Node root;

  Tree() {
    root = null;
  }

  public boolean contains(int key) {
    return containsRecursive(this.root, key);
  } 

  public boolean containsRecursive(Node currentNode, int val) {
    if(currentNode == null)
      return false;

    if(currentNode.value == val)
      return true;
    else if (currentNode.value > val)
      return containsRecursive(currentNode.leftChild, val);
    else
      return containsRecursive(currentNode.rightChild, val);
  }

  public void add(int val) {
    this.root = addRecursive(this.root, val);
  }

  private Node addRecursive(Node currentNode, int val) {
    if(currentNode == null) {
      return new Node(val);
    }

    if(currentNode.value > val) 
      currentNode.leftChild = addRecursive(currentNode.leftChild, val);
    else if(currentNode.value < val) 
      currentNode.rightChild = addRecursive(currentNode.rightChild, val);
    else if (currentNode.value == val)
      currentNode.occurrences++; 

    return currentNode;
  }

  public void remove(int key) {
    this.root = removeRecursive(this.root, key);
  }

  private Node removeRecursive(Node currentNode, int val) {
    if(currentNode == null) {
      return null;
    }

    if(currentNode.value == val) {
      if(currentNode.leftChild == null && currentNode.rightChild == null) 
        return null;
      else if(currentNode.rightChild == null) 
        return currentNode.leftChild;
      else if(currentNode.leftChild == null)
        return currentNode.rightChild;
      else {
        int smallestValue = findSmallestValue(currentNode.rightChild);
        currentNode.value = smallestValue;
        currentNode.rightChild = removeRecursive(currentNode.rightChild, smallestValue);
        return currentNode;
      }
    }

    if(currentNode.value >= val) {
      currentNode.leftChild = removeRecursive(currentNode.leftChild, val);
      return currentNode;
    } else {
      currentNode.rightChild = removeRecursive(currentNode.rightChild, val);
      return currentNode;
    }
  }

  private int findSmallestValue(Node currentNode) {
    return currentNode.leftChild == null? currentNode.value : findSmallestValue(currentNode.leftChild);
  } 
}