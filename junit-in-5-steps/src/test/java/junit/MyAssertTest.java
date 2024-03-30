package junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    private final List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
    @Test
    void test() {
        boolean test = todos.contains("AWS"); // Result
        // assertEquals(true, test);
        // assertTrue(test);
        assertTrue(test, "Something went wrong");
        assertFalse(todos.contains("Java"), "Something went wrong");
        // assertNull, assertNotNull
        assertArrayEquals(new int[]{1,2}, new int[]{1,2});

        assertEquals(3, todos.size(), "Something went wrong");
    }
}
