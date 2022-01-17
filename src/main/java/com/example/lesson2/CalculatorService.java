package com.example.lesson2;

import org.springframework.stereotype.Service;

public interface CalculatorService {
    int plus(int num1, int num2);

    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    int devide(int num1, int num2);
}
