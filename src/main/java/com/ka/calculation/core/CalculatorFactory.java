package com.ka.calculation.core;

import org.springframework.stereotype.Component;

@Component
public class CalculatorFactory {

    public FactorialCalculator getFactorialCalculator(Integer number) {
        return new FactorialCalculator(number);
    }

}
