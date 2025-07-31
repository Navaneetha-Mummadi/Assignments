package myjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });
    }

    @Test
    public void testValidDivision() {
        assertEquals(5, Calculator.divide(10, 2));
    }
}
