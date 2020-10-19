/**
 * @author yanliu
 * @create 2020-10-17-19:20
 */
public class Sort {
    /**
     * sort strings destructively
     * @param arr
     */
    public static void sort(String[] arr) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)

        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length; ++i) {
            int idx = findSmallestIdx(arr, i);
            swap(arr, i, idx);
        }
    }

    private static int findSmallestIdx(String[] arr, int start) {
        int smallestIdx = start;

        for (int i = start+1; i < arr.length; ++i) {
            if (arr[smallestIdx].compareTo(arr[i]) > 0) {
                smallestIdx = i;
            }
        }

        return smallestIdx;
    }

    private static void swap(String[] arr, int p, int q) {
        String tmp = arr[p];
        arr[p] = arr[q];
        arr[q] = tmp;
    }

}
