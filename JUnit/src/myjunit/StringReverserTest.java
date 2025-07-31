package myjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringReverserTest {

    @Test
    public void testRegularString() {
        assertEquals("cba", StringReverser.reverse("abc"));
        assertEquals("987654321", StringReverser.reverse("123456789"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", StringReverser.reverse(""));
    }

    @Test
    public void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringReverser.reverse(null);
        });
    }
}
