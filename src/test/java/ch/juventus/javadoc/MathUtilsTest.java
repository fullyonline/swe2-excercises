package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private static MathUtils mathUtils;

    @BeforeAll
    static void initAll(){
        mathUtils = new MathUtils();
    }

    @Test
    void shouldAddSeveralPositiveNumbers() {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(1.0d);
        doubleList.add(3.0d);
        doubleList.add(4.0d);

        Double result = mathUtils.addition(doubleList);

        assertEquals(8.0d, result);
    }

    @Test
    void shouldAddSeveralNumbers() {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(1.36666d);
        doubleList.add(-3.1255d);
        doubleList.add(4.4555d);

        Double result = mathUtils.addition(doubleList);

        assertEquals(2.6966599999999996d, result);
    }

    @Test
    void shouldSubtractPositiveNumbers() {
        Double result = mathUtils.subtraction(4,2);
        assertEquals(2, result);
    }

    @Test
    void shouldSubtractPositiveNumbersComplex() {
        Double result = mathUtils.subtraction(10.2226,3.2444);
        assertEquals(6.978199999999999, result);
    }

    @Test
    void shouldSubtractNegativeNumbers() {
        Double result = mathUtils.subtraction(4,-2);
        assertEquals(6, result);
    }

    @Test
    void shouldSubtractNegativeNumbersAndHasNegativeResult() {
        Double result = mathUtils.subtraction(10,12);
        assertEquals(-2, result);
    }

    @Test
    void shouldDivide() {
        assertEquals(2, mathUtils.division(8,4));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.division(8,0));
    }

    @Test
    void shouldMultiplyPositive() {
        Double result = mathUtils.multiplication(3, 4);
        assertEquals(12, result);
    }

    @Test
    void shouldMultiplyNegative() {
        Double result = mathUtils.multiplication(-3, 4);
        assertEquals(-12, result);
    }
}