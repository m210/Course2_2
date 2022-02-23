package com.example.lesson2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private CalculatorService service;

    @BeforeEach
    public void init() {
        this.service = new CalculatorServiceImpl();
    }

    @Test
    public void add() {
        int out = service.plus(2, 5);

        assertNotNull(service);
        assertEquals(out, 7);
    }

    @Test
    public void minus() {
        int out = service.minus(2, 5);

        assertNotNull(service);
        assertEquals(out, -3);
    }

    @Test
    public void multiply() {
        int out = service.multiply(2, 5);

        assertNotNull(service);
        assertEquals(out, 10);
    }

    @Test
    public void devide() {
        int out = service.devide(2, 4);

        assertNotNull(service);
        assertEquals(out, 0);
    }

    @Test
    public void devideException() {
        assertNotNull(service);
        assertThrows(IllegalArgumentException.class, () -> service.devide(2, 0));
    }
}
