package com.br.interfaces;

import com.br.implementations.searchTree.Node;

/**
 * @author rafaelcfreire
 *
 */
public interface SearchTree {

  /**
   * @return
   */
  public Node getRoot();
  
  /**
   * @param newNode
   */
  public void insertNode(Node newNode);
  
  /**
   * @param value
   * @return
   */
  public boolean search(int value);
  
  /**
   * @param rootNode
   * @return
   */
  public String inOrderReading(Node rootNode);
  
  /**
   * @param rootNode
   * @return
   */
  public String preOrderReading(Node rootNode);
  
  /**
   * @param rootNode
   * @return
   */
  public String postOrderReading(Node rootNode);
}
