package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {

    private Main calculator;

    @BeforeEach
    void setUp() {
        calculator = new Main();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0), "Dividing by zero should throw IllegalArgumentException");
    }
}
