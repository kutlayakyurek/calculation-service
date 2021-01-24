package com.ka.calculation.core;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FactorialCalculator implements Calculator {

  private final int number;

  @Override
  public int calculate() {
    return factorial(number);
  }

  private int factorial(int number) {
    if (number == 0) {
      return 1;
    } else {
      return (number * factorial(number - 1));
    }
  }

}
