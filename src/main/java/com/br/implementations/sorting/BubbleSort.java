package com.br.implementations.sorting;

import com.br.interfaces.SortingAlgorithms;

/**
 * The most basic ordering algorithm. Consists of ordering an array with comparisons with the
 * subsequent element. His poor performance (Average = O(n) and Worst case = O(n2) does not
 * recommend its use for large arrays.
 * 
 * @author rafaelcfreire
 *
 */
public class BubbleSort implements SortingAlgorithms {

  /*
   * (non-Javadoc)
   * 
   * @see com.br.interfaces.SortingAlgorithms#implementSorting(int[])
   */
  public int[] implementSorting(int[] numbers) {
    boolean numbersSwitched;
    do {
      numbersSwitched = false;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i + 1] < numbers[i]) {
          int tmp = numbers[i + 1];
          numbers[i + 1] = numbers[i];
          numbers[i] = tmp;
          numbersSwitched = true;
        }
      }
    } while (numbersSwitched);
    return numbers;
  }
}
