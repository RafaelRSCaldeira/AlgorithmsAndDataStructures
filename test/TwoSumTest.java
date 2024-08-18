import org.junit.*;
import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void sumTest() {
        int[] arr = {11, 15, 2, 7};
        int target = 9;
        int[] expected = {2, 7};
        int[] result = TwoSum.sum(arr, target);
        assertArrayEquals(expected, result);
        assertArrayEquals(new int[0], TwoSum.sum(arr, 10));
    } 
}
