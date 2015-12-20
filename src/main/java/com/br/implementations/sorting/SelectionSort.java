package com.br.implementations.sorting;

import com.br.interfaces.SortingAlgorithms;

public class SelectionSort implements SortingAlgorithms{

  public int[] implementSorting(int[] numbers) {
    int min, temp;
    
    for(int value = 0; value < numbers.length; value++){
      min = value;
      for(int innerCount = value; innerCount < numbers.length; innerCount++){
        if(numbers[innerCount] < numbers[value])
          min = innerCount;
      }
      temp = numbers[min];
      numbers[min] = numbers[value];
      numbers[value] = temp;
    }
    return numbers;
  }
}
