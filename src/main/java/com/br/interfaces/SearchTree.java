package com.br.interfaces;

import com.br.implementations.searchTree.Node;

/**
 * @author rafaelcfreire
 *
 */
public interface SearchTree {

  /**
   * Retrieve the root node in a search tree.
   * @return Node
   */
  public Node getRoot();
  
  /**
   * Finds and inserts the exact place to insert the new node in a search tree.
   * @param newNode
   */
  public void insertNode(Node newNode);
  
  /**
   * Search for a node with the specific value and return true if find and false if don't.
   * @param value
   * @return
   */
  public boolean search(int value);
  
  /**
   * Starts reading from the most left child, his root node then the right node 
   * until arrives to the main root.
   * 
   * @param rootNode
   * @return
   */
  public String inOrderReading(Node rootNode);
  
  /**
   * Starts reading the main root, his left child and its children then goes to the right.
   * 
   * @param rootNode
   * @return
   */
  public String preOrderReading(Node rootNode);
  
  /**
   * Reads the left child from the main root, its children then goes to the right 
   * and just then read the main root.
   * 
   * @param rootNode
   * @return
   */
  public String postOrderReading(Node rootNode);
}
