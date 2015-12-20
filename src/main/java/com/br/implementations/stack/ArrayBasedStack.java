package com.br.implementations.stack;

import com.br.interfaces.Stack;

/**
 * This is an implementation of the Stack Interface, note that an array is used
 * to keep the elements. This implementation relies on a fixed capacity array
 * 
 * @author rafaelcfreire
 *
 * @param <E>
 */
public class ArrayBasedStack<E> implements Stack<E>{
  
  /**
   * The capacity of our Stack, an array based Stack is sized limited.
   */
  public static final int CAPACITY = 1000;
  
  /**
   * The Array that holds our items.
   */
  private E[] data;
  
  private int index = -1;
  
  public ArrayBasedStack() {
    this(CAPACITY);
  }
  
  public ArrayBasedStack(int capacity) {
    data = (E[]) new Object[capacity];
  }
  
  public void push(E e) {
    if(size() == data.length)
      throw new IllegalStateException("Stack is full");
    
    data[++index] = e;
  }

  public E pop() {
    if(isEmpty())
      return null;

    E answer = data[index];
    
    data[index] = null;
    
    return answer;
  }

  public E top() {
    if(isEmpty())
      return null;
    
    return data[index];
  }

  public int size() {
    return index + 1;
  }

  public boolean isEmpty() {
    return index == -1;
  }  
}
