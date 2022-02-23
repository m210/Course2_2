package com.example.lesson2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.lang.NonNull;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParamTest {

    private CalculatorService service = new CalculatorServiceImpl();

    private enum Action {
        Plus, Minus, Devide, Multiply
    };

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void test(int num1, int num2, Action act, int result) {
        int out = 0;
        switch(act) {
            case Plus:
                out = service.plus(num1, num2);
                break;
            case Minus:
                out = service.minus(num1, num2);
                break;
            case Devide:
                out = service.devide(num1, num2);
                break;
            case Multiply:
                out = service.multiply(num1, num2);
                break;
        }

        assertNotNull(service);
        assertEquals(out, result);
    }

    @NonNull
    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(1, 1, Action.Plus, 2),
                Arguments.of(1, 4, Action.Minus, -3),
                Arguments.of(10, 2, Action.Devide, 5),
                Arguments.of(20, 3, Action.Multiply, 60)
        );
    }

}
