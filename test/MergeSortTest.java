import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;



public class MergeSortTest {
    Sort sorting = new MergeSort();
    @Test
    public void sortTest() {
        int[] arr = {87, 23, 56, 34, 78, 45, 12, 89, 67, 33, 21, 90, 54, 72, 41, 82, 63, 19, 77, 28, 50, 31, 80, 94, 60, 44, 85, 16, 68, 97, 22, 53, 11, 29, 88, 69, 43, 76, 40, 52, 26, 91, 58, 25, 74, 13, 46, 81, 39, 71};
        sorting.sort(arr);
        int[] sorted = {11, 12, 13, 16, 19, 21, 22, 23, 25, 26, 28, 29, 31, 33, 34, 39, 40, 41, 43, 44, 45, 46, 50, 52, 53, 54, 56, 58, 60, 63, 67, 68, 69, 71, 72, 74, 76, 77, 78, 80, 81, 82, 85, 87, 88, 89, 90, 91, 94, 97};
        assertTrue(Arrays.equals(sorted, arr));
    }    
}
