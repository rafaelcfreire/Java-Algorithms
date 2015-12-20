package com.br.implementations.searchTree;

public class Node {
  
  /**
   * The representational value of a node.
   */
  private int value;
  
  /**
   * Its left child
   */
  private Node left;
  
  /**
   * Its right child
   */
  private Node right;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  
  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }
  
  public Node getRight() {
    return right;
  }
  
  public void setRight(Node right) {
    this.right = right;
  }
}
