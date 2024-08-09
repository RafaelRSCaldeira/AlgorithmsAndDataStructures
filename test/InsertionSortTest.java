import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;



public class InsertionSortTest {
    Sort sorting = new InsertionSort();
    @Test
    public void sortTest() {
        int[] arr = {10, 7, 1, 8, 5, 0};
        sorting.sort(arr);
        int[] sorted = {0, 1, 5, 7, 8, 10};
        assertTrue(Arrays.equals(sorted, arr));
    }    
}
