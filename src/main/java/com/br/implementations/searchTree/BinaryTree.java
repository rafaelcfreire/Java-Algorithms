package com.br.implementations.searchTree;

import com.br.interfaces.SearchTree;

/**
 * The binary tree data structure. This implementation relies on a root node and his respective children
 * (left and right). The children are holded by the proper node instead in a list.
 * 
 *              Average     Worst case
 *      Space   O(n)        O(n)
 *      Search  O(log n)    O(n)
 *      Insert  O(log n)    O(n)
 *      Delete  O(log n)    O(n)
 *  
 * @author rafaelcfreire
 */
public class BinaryTree implements SearchTree{
  
  /**
   * 
   */
  private Node root;
  
  public Node getRoot(){
    return this.root;
  }
  
  public void insertNode(Node newNode) {
    if(root == null){
      root = newNode;
    } else {
      insertNode(root, newNode);
    }
  }

  private void insertNode(Node rootNode, Node newNode) {
    if(newNode.getValue() < rootNode.getValue()) {
      if(rootNode.getLeft() == null)
        rootNode.setLeft(newNode);
      else
        insertNode(rootNode.getLeft(), newNode);
    } else {
      if(rootNode.getRight() == null)
        rootNode.setRight(newNode);
      else
        insertNode(rootNode.getRight(), newNode);
    }
  }
  
  public boolean search(int value) {
    if(getNode(root, value) == null)
      return false;

    return true;
  }
  
  private Node getNode(Node rootNode, int value) {
    if (rootNode == null)
      return null;
    if (rootNode.getValue() == value)
      return rootNode;
    if (value < rootNode.getValue())
      return getNode(rootNode.getLeft(), value);
    return getNode(rootNode.getRight(), value);
  }
  
  public String inOrderReading(Node rootNode) {
    String finalValue = "";
    
    if(rootNode.getLeft() != null)
      finalValue += inOrderReading(rootNode.getLeft());
    finalValue += rootNode.getValue() + "|";
    if(rootNode.getRight() != null)
      finalValue += inOrderReading(rootNode.getRight());
    
    return finalValue;
  }
  
  public String preOrderReading(Node rootNode) {
    String finalValue = "";
    
    finalValue += rootNode.getValue() + "|";
    if(rootNode.getLeft() != null)
      finalValue += preOrderReading(rootNode.getLeft());
    if(rootNode.getRight() != null)
      finalValue += preOrderReading(rootNode.getRight());
    
    return finalValue;
  }
  
  public String postOrderReading(Node rootNode) {
    String finalValue = "";
    
    if(rootNode.getLeft() != null)
      finalValue += preOrderReading(rootNode.getLeft());
    if(rootNode.getRight() != null)
      finalValue += preOrderReading(rootNode.getRight());
    finalValue += rootNode.getValue() + "|";

    return finalValue;
  }
}
