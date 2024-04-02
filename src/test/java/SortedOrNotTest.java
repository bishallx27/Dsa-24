import org.example.SortedOrNot;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortedOrNotTest {
    @Test
    public void TestSortedorNot() {
        int[] arr = {7, 2, 5, 4, 3, 1};
        int[] expected = {1, 2, 3, 4, 5, 7};
        int[] actual = SortedOrNot.sorted(arr);
        assertArrayEquals(expected, actual);
    }
}
