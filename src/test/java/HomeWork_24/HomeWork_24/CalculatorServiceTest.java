package HomeWork_24.HomeWork_24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void testPlus () {
        assertEquals(12,calculatorService.plus(3,9));
        assertEquals(3,calculatorService.plus(-2,5));
    }

    @Test
    void testMinus () {
        assertEquals(3,calculatorService.minus(12,9));
        assertEquals(-5,calculatorService.minus(-2,3));
    }
    @Test
    void testMultiply () {
        assertEquals(144,calculatorService.multiply(12,12));
        assertEquals(-6,calculatorService.multiply(-2,3));
        assertEquals(6,calculatorService.multiply(2,3));
    }
    @Test
    void testDivide () {
        assertEquals(12,calculatorService.divide(144,12));
        assertEquals(-2,calculatorService.divide(-6,3));
        assertEquals(1,calculatorService.divide(2,2));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(10,0));
    }
}