package com.br.implementations.sorting;

import com.br.interfaces.SortingInterface;

public class InsertionSort implements SortingInterface{

  public int[] implementSorting(int[] numbers) {
    int temp;
    for(int count = 0; count < numbers.length; count++){
      int innerCount = count;
      while(innerCount > 0 && numbers[innerCount] < numbers[innerCount - 1]){
        temp = numbers[innerCount];
        numbers[innerCount] = numbers[innerCount - 1];
        numbers[innerCount - 1] = temp;
        innerCount = innerCount - 1;
      }
    }
    return numbers;
  }
}
