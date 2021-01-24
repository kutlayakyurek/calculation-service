package com.ka.calculation.service;

import com.ka.calculation.core.CalculatorFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {

    private final CalculatorFactory calculatorFactory;

    @Override
    public int getFactorial(int number) {
        return calculatorFactory.getFactorialCalculator(number).calculate();
    }

}
