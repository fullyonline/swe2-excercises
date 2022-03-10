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

        assertEquals(8.0d, mathUtils.addition(doubleList));
    }

    @Test
    void shouldAddSeveralNumbers() {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(1.0d);
        doubleList.add(-3.0d);
        doubleList.add(4.0d);

        assertEquals(2.0d, mathUtils.addition(doubleList));
    }

    @Test
    void shouldSubtractPositiveNumbers() {
        assertEquals(2, mathUtils.subtraction(4,2));
        assertEquals(7, mathUtils.subtraction(10,3));
    }

    @Test
    void shouldSubtractPositiveAndNegativeNumbers() {
        assertEquals(6, mathUtils.subtraction(4,-2));
        assertEquals(-2, mathUtils.subtraction(10,12));
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
    void shouldMultiply() {
        assertEquals(12, mathUtils.multiplication(3, 4));
        assertEquals(-12, mathUtils.multiplication(-3, 4));
    }
}