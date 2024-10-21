package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5.0, Calculator.calculate(2, 3, '+'), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, Calculator.calculate(5, 4, '-'), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, Calculator.calculate(2, 3, '*'), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.calculate(6, 3, '/'), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.calculate(1, 0, '/'));
    }
}
