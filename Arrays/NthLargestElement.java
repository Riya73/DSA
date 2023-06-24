public class NthLargestElement {
    public static int findNthLargest(int[] array, int n) {
      for (int i = 0; i < n; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }

        return array[n - 1];
    }

    public static void main(String[] args) {
        int[] array = {9, 5, 2, 7, 1, 10};
        int n = 4;
        int nthLargest = findNthLargest(array, n);
        System.out.println(n + "th largest element: " + nthLargest);
    }
}

