package com.example.lesson2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int devide(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException(num1 + " shouldn't be divided by 0");
        }
        return num1 / num2;
    }
}
