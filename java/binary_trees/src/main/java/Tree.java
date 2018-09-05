import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
      //Recursive call, but change pointer to leftChild
      return containsRecursive(currentNode.leftChild, val);
    else
      //Recursive call, but change pointer to leftChild
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
      //Recursive call, but change pointer to leftChild
      currentNode.leftChild = addRecursive(currentNode.leftChild, val);
    else if(currentNode.value < val) 
      //Recursive call, but change pointer to rightChild
      currentNode.rightChild = addRecursive(currentNode.rightChild, val);
    else if (currentNode.value == val)
      //Increment the number of occurrances
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
        //Parent node has no children
        return null;
      else if(currentNode.rightChild == null) 
        //Parent node only has a left child
        return currentNode.leftChild;
      else if(currentNode.leftChild == null)
        //Parent node only has a right child
        return currentNode.rightChild;
      else {
        //Parent node has two children

        //Find the smallest value in the right subtree (with the parent node as the root)
        //To replace the value of the parent node
        int smallestValue = findSmallestValue(currentNode.rightChild);
        currentNode.value = smallestValue;
        //After replacing the value of the parent node
        //Remove the node with the value as the replacement
        currentNode.rightChild = removeRecursive(currentNode.rightChild, smallestValue);
        return currentNode;
      }
    }

    //Continue traversing the tree
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

  public String InOrderTraversal() {
    String output = "";
    ArrayList<Integer> list = new ArrayList<Integer>();
    InOrderTraversalRecursive(this.root, list);
    
    for(int i = 0; i < list.size(); i++) {
      output += list.get(i) + " ";
    }

    return output;
  }
 
  private void InOrderTraversalRecursive(Node currentNode, ArrayList<Integer> list) {
    if(currentNode != null) {
      InOrderTraversalRecursive(currentNode.leftChild, list);
      list.add(currentNode.value);
      InOrderTraversalRecursive(currentNode.rightChild, list);
    } 
  }

  public String PreOrderTraversal() {
    String output = "";
    ArrayList<Integer> list = new ArrayList<Integer>();
    PreOrderTraversalRecursive(this.root, list);
    
    for(int i = 0; i < list.size(); i++) {
      output += list.get(i) + " ";
    }

    return output;
  }
 
  private void PreOrderTraversalRecursive(Node currentNode, ArrayList<Integer> list) {
    if(currentNode != null) {
      list.add(currentNode.value);
      PreOrderTraversalRecursive(currentNode.leftChild, list);
      PreOrderTraversalRecursive(currentNode.rightChild, list);
    } 
  }

    public String PostOrderTraversal() {
    String output = "";
    ArrayList<Integer> list = new ArrayList<Integer>();
    PostOrderTraversalRecursive(this.root, list);
    
    for(int i = 0; i < list.size(); i++) {
      output += list.get(i) + " ";
    }

    return output;
  }
 
  private void PostOrderTraversalRecursive(Node currentNode, ArrayList<Integer> list) {
    if(currentNode != null) {
      PostOrderTraversalRecursive(currentNode.leftChild, list);
      PostOrderTraversalRecursive(currentNode.rightChild, list);
      list.add(currentNode.value);
    } 
  }

  public String BFTraversal() {
    if(this.root == null) {
      return "";
    }

    Queue<Node> nodes = new LinkedList<>();
    String output = "";
    nodes.add(root);
    
    while(!nodes.isEmpty()) {
      Node node = nodes.remove();
      output += node.value + " ";

      if(node.leftChild != null) {
        nodes.add(node.leftChild);
      }

      if(node.rightChild != null) {
        nodes.add(node.rightChild);
      }
    }

    return output;
  }
}