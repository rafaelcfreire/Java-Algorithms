package com.br.tests;

import junit.framework.Assert;

import org.junit.Test;

import com.br.implementations.stack.ArrayBasedStack;
import com.br.interfaces.Stack;

public class StackTest {

  Stack<Integer> stack = new ArrayBasedStack<Integer>();

  @Test
  public void pushItem() {
    Integer insertedItem = new Integer(42);
    stack.push(insertedItem);
    Assert.assertTrue(stack.top() == insertedItem);
  }
  
  @Test
  public void popItem() {
    stack.pop();
    Assert.assertNull(stack.top());
  }
  
  @Test
  public void topStack() {
    stack.push(new Integer(15));
    stack.push(new Integer(45));
    stack.push(new Integer(75));
    stack.push(new Integer(95));
    
    Assert.assertEquals(new Integer(95), stack.top());
  }
  
  @Test
  public void sizeStack() {
    Assert.assertEquals(0, stack.size());
  }
}
