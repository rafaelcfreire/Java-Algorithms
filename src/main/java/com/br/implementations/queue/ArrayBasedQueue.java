package com.br.implementations.queue;

import com.br.interfaces.Queue;

/**
 * Implementation using a circular array to hold the front index, instead of updating the items index every time a item
 * is dequeued.
 * 
 * @author rafaelcfreire
 *
 * @param <E>
 */
public class ArrayBasedQueue<E> implements Queue<E> {

	/**
	 * Array that will storage our items
	 */
	private E[] data;
	
	/* (non-Javadoc)
	 * @see com.br.interfaces.Queue#size()
	 */
	public int size() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.br.interfaces.Queue#isEmpty()
	 */
	public boolean isEmpty() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.br.interfaces.Queue#enqueue(java.lang.Object)
	 */
	public void enqueue(E e) {

	}

	/* (non-Javadoc)
	 * @see com.br.interfaces.Queue#first()
	 */
	public E first() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.br.interfaces.Queue#dequeue()
	 */
	public E dequeue() {
		return null;
	}

}
