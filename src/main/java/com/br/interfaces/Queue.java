package com.br.interfaces;

/**
 * @author rafaelcfreire
 *
 * @param <E>
 */
public interface Queue<E> {
  
  /**
   * @return
   */
  public int size();
  
  /**
   * @return
   */
  public boolean isEmpty();
  
  /**
   * @param e
   */
  public void enqueue(E e);
  
  /**
   * @return
   */
  public E first();
  
  /**
   * @return
   */
  public E dequeue();
}
