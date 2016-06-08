package com.br.implementations.sorting;

import com.br.interfaces.SortingAlgorithms;

/**
 * The MergeSort algorithm consists of breaking the initial array into smaller arrays and ordering
 * themselves. This algorithm consumes more space due his need to create more arrays but it
 * compensates the time spent because does not compare the whole array. Its performance is o(n log
 * n) and each merge operation is o(n).
 * 
 * @author rafaelcfreire
 *
 */
public class MergeSort implements SortingAlgorithms {

  /* (non-Javadoc)
 * @see com.br.interfaces.SortingAlgorithms#implementSorting(int[])
 */
public int[] implementSorting(int[] numbers) {
    if (numbers.length < 2) {
      return numbers;
    }
    
    return null;
  }

  /**
 * @param leftArray
 * @param rightArray
 * @return
 */
private static int[] merge(final int[] leftArray, final int[] rightArray) {
    final int[] merged = new int[leftArray.length + rightArray.length];
    
    return merged;
  }
}
