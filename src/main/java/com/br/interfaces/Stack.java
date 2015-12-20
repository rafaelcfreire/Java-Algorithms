package com.br.interfaces;

/**
 * An interface definition for Stack implementations. 
 * Contains name diferently defined than the java.util.Stack
 * 
 * @author rafaelcfreire
 *
 * @param <E>
 */
public interface Stack<E> {
  
  /**
   * Inserts an element at the top of the stack.
   * @param e the element to be inserted
   */
  public void push(E e);
  
  /**
   * Removes and returns the top element from the stack.
   *  @return element removed (or null if empty)
   */
  public E pop();
  
  /**
   * Returns, but does not remove, the element at the top of the stack.
   * @return top element in the stack (or null if empty)
   */
  public E top();
  
  /**
   * Returns the number of elements in the stack.
   * @return number of elements in the stack
   */
  public int size();
  
  /**
   * Tests whether the stack is empty.
   * @return true if the stack is empty, false otherwise
   */
  public boolean isEmpty();
}
