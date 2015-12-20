package com.br.tests;
import junit.framework.Assert;

import org.junit.Test;

import com.br.implementations.searchTree.BinaryTree;
import com.br.implementations.searchTree.Node;

public class BinaryTreeTest {
  
  BinaryTree tree;
  
  public BinaryTreeTest() {
    Node node1 = new Node(5);
    Node node2 = new Node(-3);
    Node node3 = new Node(8);
    Node node4 = new Node(0);
    Node node5 = new Node(15);
    Node node6 = new Node(22);
    Node node7 = new Node(61);
    
    tree = new BinaryTree();
    tree.insertNode(node1);
    tree.insertNode(node2);
    tree.insertNode(node3);
    tree.insertNode(node4);
    tree.insertNode(node5);
    tree.insertNode(node6);
    tree.insertNode(node7);
  }
  
  @Test
  public void testSearch(){
    Assert.assertTrue(tree.search(15));
    Assert.assertFalse(tree.search(92));    
  }
  
  @Test
  public void inOrderReadingTest(){
    String expected = "-3|0|5|8|15|22|61|";
    Assert.assertEquals(expected, tree.inOrderReading(tree.getRoot()));
  }
  
  @Test
  public void preOrderReadingTest(){
    String expected = "5|-3|0|8|15|22|61|";
    Assert.assertEquals(expected, tree.preOrderReading(tree.getRoot()));
  }
  
  @Test
  public void postOrderReadingTest(){
    String expected = "-3|0|8|15|22|61|5|";
    Assert.assertEquals(expected, tree.postOrderReading(tree.getRoot()));
  }
}
