package myjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialValidInputs() {
        assertEquals(1, Factorial.compute(0));   
        assertEquals(1, Factorial.compute(1));   
        assertEquals(2, Factorial.compute(2));   
        assertEquals(6, Factorial.compute(3));   
        assertEquals(24, Factorial.compute(4));  
        assertEquals(120, Factorial.compute(5)); 
    }

    @Test
    public void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.compute(-1);
        });
    }
}
