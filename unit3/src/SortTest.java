import org.junit.Test;

/**
 * @author yanliu
 * @create 2020-10-17-19:36
 */
public class SortTest {
    @Test
    public void testSort() {
        String[] arr = new String[] {"6", "9", "3"};
        Sort.sort(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
