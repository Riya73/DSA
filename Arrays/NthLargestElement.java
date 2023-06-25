package Arrays;

import java.util.Arrays;

public class NthLargestElement {
static int nthLargest(int[] arr, int n) {
   int[] largestElements = new int[n];
    Arrays.fill(largestElements, Integer.MIN_VALUE);

    for (int num : arr) {
        if (num > largestElements[0]) {
            largestElements[0] = num;
            int i = 0;
            while (i < n - 1 && largestElements[i] > largestElements[i + 1]) {
                swap(largestElements, i, i + 1);
                i++;
            }
        }
    }

    return largestElements[0];
}

private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
public static void main(String[] args) {
        int[] array = {9, 5, 2, 7, 1, 10};
        int n = 4;
        int nthLargest = nthLargest(array, n);
        System.out.println(n + "th largest element: " + nthLargest);
    }
}

