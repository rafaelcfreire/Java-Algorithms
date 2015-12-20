package com.br.implementations.sorting;

import com.br.interfaces.SortingInterface;

public class BubbleSort implements SortingInterface{

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
