package Arrays;

public class ZigZagArray {
    private static void zigZag(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        // Swap the elements at odd index positions if they are greater
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Swap the elements at even index positions if they are smaller
        for (int i = 1; i < n - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        zigZag(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr [] ={4,3,7,8,6,2,1};
        int n = arr.length;
        zigZag(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            }
    }
}

