package com.br.tests;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.br.implementations.sorting.BubbleSort;
import com.br.implementations.sorting.InsertionSort;
import com.br.implementations.sorting.SelectionSort;
import com.br.interfaces.SortingInterface;


public class DefaultTest {

  @Test
  public void naturalSorting() {
    final int[] initial = {-3, -5, 1, 7, 4, -2};
    final int[] expected = {-5, -3, -2, 1, 4, 7};
    SortingInterface algo = new BubbleSort();
    assertArrayEquals(expected, algo.implementSorting(initial));
  }

  @Test
  public void selectionSortingTest() {
    final int[] initial = {-3, -5, 1, 7, 4, -2};
    final int[] expected = {-5, -3, -2, 1, 4, 7};
    SortingInterface algo = new SelectionSort();
    assertArrayEquals(expected, algo.implementSorting(initial));
  }

  @Test
  public void insertionSortingTest() {
    final int[] initial = {-3, -5, 1, 7, 4, -2};
    final int[] expected = {-5, -3, -2, 1, 4, 7};
    SortingInterface algo = new InsertionSort();
    assertArrayEquals(expected, algo.implementSorting(initial));
  }
  
}
