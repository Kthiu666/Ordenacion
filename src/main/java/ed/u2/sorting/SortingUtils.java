package ed.u2.sorting;

public class SortingUtils {
    /**
     * Intercambia dos elementos en un arreglo (in-place).
     */
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
