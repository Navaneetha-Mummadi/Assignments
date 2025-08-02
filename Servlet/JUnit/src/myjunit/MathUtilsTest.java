package myjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testFactorialValidInputs() {
        assertEquals(1, MathUtils.factorial(0));  // 0! = 1
        assertEquals(1, MathUtils.factorial(1));  // 1! = 1
        assertEquals(2, MathUtils.factorial(2));  // 2! = 2
        assertEquals(6, MathUtils.factorial(3));  // 3! = 6
        assertEquals(24, MathUtils.factorial(4)); // 4! = 24
    }

    @Test
    public void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.factorial(-5);
        });
    }
}
