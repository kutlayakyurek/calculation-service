package com.ka.calculation.controller;

import com.ka.calculation.model.FactorialResponse;
import com.ka.calculation.service.CalculatorService;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@AllArgsConstructor
public class CalculatorController {

  private final CalculatorService calculatorService;

  @GetMapping(value = "/factorial")
  public @ResponseBody
  FactorialResponse getFactorial(@RequestParam @Valid @Min(0) int number) {
    return new FactorialResponse(calculatorService.getFactorial(number));
  }

}
