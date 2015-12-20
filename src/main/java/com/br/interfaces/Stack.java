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
   * @param e
   */
  public void push(E e);
  
  /**
   * @return
   */
  public E pop();
  
  /**
   * @return
   */
  public E top();
  
  /**
   * @return
   */
  public int size();
  
  /**
   * @return
   */
  public boolean isEmpty();
}
