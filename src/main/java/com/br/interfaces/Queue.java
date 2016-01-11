package com.br.interfaces;

/**
 * @author rafaelcfreire
 *
 * @param <E>
 */
public interface Queue<E> {
  
  /**
   * Returns the number of elements in the queue.
   * @return the size of the queue
   */
  public int size();
  
  /**
   * Tests whether the queue is empty.
   * @return true if empty, false if not
   */
  public boolean isEmpty();
  
  /**
   * Inserts an element at the rear of the queue.
   * @param e The element to be inserted
   */
  public void enqueue(E e);
  
  /**
   * Returns, but does not remove, the first element of the queue (null if empty).
   * @return The first element of the queue
   */
  public E first();
  
  /**
   * Removes and returns the first element of the queue (null if empty).
   * @return The element removed from the queue
   */
  public E dequeue();
}
