package HomeWork_24.HomeWork_24;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParametersTest {

    CalculatorService calculatorService = new CalculatorService();

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of(5,10),
                Arguments.of(-2,-6),
                Arguments.of(1,0)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void testPlus (int numA, int numB) {
        assertEquals(numA + numB, calculatorService.plus(numA,numB));
    }
    @ParameterizedTest
    @MethodSource("arguments")
    void testMinus (int numA, int numB) {
        assertEquals(numA - numB, calculatorService.minus(numA,numB));
    }
    @ParameterizedTest
    @MethodSource("arguments")
    void testMultiply (int numA, int numB) {
        assertEquals(numA * numB, calculatorService.multiply(numA,numB));
    }
    @ParameterizedTest
    @MethodSource("arguments")
    void testDevide (int numA, int numB) {
        if (numB == 0) {
            assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(numA,numB));
        } else
        assertEquals(numA / numB, calculatorService.divide(numA,numB));
    }
}
