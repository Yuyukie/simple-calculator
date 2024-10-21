package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.calculate(1, 0, '/');
    }
}