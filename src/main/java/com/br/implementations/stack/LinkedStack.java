package com.br.implementations.stack;

import java.util.LinkedList;

import com.br.interfaces.Stack;

public class LinkedStack<E> implements Stack<E> {

  private LinkedList<E> list = new LinkedList<E>();
  
  public void push(E e) {
      list.addFirst(e);
  }

  public E pop() {
    if(isEmpty())
      return null;

    return list.removeFirst();
  }

  public E top() {
    return list.getFirst();
  }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
}
