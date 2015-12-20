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
  
  public void push(E e);
  
  public E pop();
  
  public E top();
  
  public int size();
  
  public boolean isEmpty();
}
