package com.br.implementations.queue;

import com.br.interfaces.Queue;

/**
 * Implementation using a circular array to hold the front index, instead of updating the items index every time a item
 * is dequeued.
 * 
 * @author rafael
 *
 * @param <E>
 */
public class ArrayBasedQueue<E> implements Queue<E> {

	/**
	 * Array that will storage our items
	 */
	private E[] data;
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void enqueue(E e) {
		// TODO Auto-generated method stub

	}

	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

}
