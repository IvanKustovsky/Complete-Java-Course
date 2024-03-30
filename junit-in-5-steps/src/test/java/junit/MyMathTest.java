package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    private final MyMath myMath = new MyMath();

    // Absence of failure is success
    @Test
    void calculateSum_DirtyCode() {
        int[] numbers = {1,3,7};
        MyMath myMath = new MyMath();
        int result = myMath.calculateSum(numbers);
        int expectedResult = 11;
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateSum_CleanCode() {
        assertEquals(11, myMath.calculateSum(new int[]{1,3,7}));
    }

    @Test
    void calculateSum_ZeroLengthArray() {
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }
}
