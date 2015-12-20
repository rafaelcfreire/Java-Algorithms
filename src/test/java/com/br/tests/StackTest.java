package com.br.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.br.implementations.stack.ArrayBasedStack;
import com.br.implementations.stack.LinkedStack;
import com.br.interfaces.Stack;

/**
 * One test for both implementations of Stack, will be changed in a near future ;)
 * @author rafaelcfreire
 *
 */
public class StackTest {

  Stack<Integer> stack = new ArrayBasedStack<Integer>();
  Stack<Integer> linkedStack = new LinkedStack<Integer>();

  @Test
  public void pushItem() {
    Integer insertedItem = new Integer(42);
    stack.push(insertedItem);
    
    linkedStack.push(insertedItem);
    
    Assert.assertTrue(stack.top() == insertedItem);
    Assert.assertTrue(linkedStack.top() == insertedItem);
  }
  
  @Test
  public void popItem() {
    Assert.assertNull(stack.pop());
    Assert.assertNull(linkedStack.pop());
  }
  
  @Test
  public void topStack() {
    stack.push(new Integer(15));
    stack.push(new Integer(45));
    stack.push(new Integer(75));
    stack.push(new Integer(95));
    
    linkedStack.push(new Integer(15));
    linkedStack.push(new Integer(45));
    linkedStack.push(new Integer(75));
    linkedStack.push(new Integer(95));
    
    Assert.assertEquals(new Integer(95), stack.top());
    Assert.assertEquals(new Integer(95), linkedStack.top());
  }
  
  @Test
  public void sizeStack() {
    Assert.assertEquals(0, stack.size());
    Assert.assertEquals(0, linkedStack.size());
  }
}
