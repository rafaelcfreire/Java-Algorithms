package com.br.implementations.sorting;

import com.br.interfaces.SortingAlgorithms;

/**
 * Every time a new element is inserted in an array this algorithm performs comparisons between
 * elements and its next element. Relatively close to BubbleSort, this
 * algorithm has a worse case order of O(n2) taking into account that only one element is switched
 * per iteration.
 * 
 * @author rafaelcfreire
 *
 */
public class InsertionSort implements SortingAlgorithms {

  public int[] implementSorting(int[] numbers) {
    int temp;
    
    for (int count = 0; count < numbers.length; count++) {
      int innerCount = count;
      while (innerCount > 0 && numbers[innerCount] < numbers[innerCount - 1]) {
        temp = numbers[innerCount];
        numbers[innerCount] = numbers[innerCount - 1];
        numbers[innerCount - 1] = temp;
        innerCount = innerCount - 1;
      }
    }
    return numbers;
  }
}
