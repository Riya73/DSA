package Arrays;
public class ThirdLargestElement {
  static int thirdLargest(int[] arr, int n) {
    int largest = arr[0];
    int secondLargest = -1;
    int thirdLargest = -1;

    for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
            thirdLargest = secondLargest;
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] < largest && arr[i] > secondLargest) {
            thirdLargest = secondLargest;
            secondLargest = arr[i];
        } else if (arr[i] < secondLargest && arr[i] > thirdLargest) {
            thirdLargest = arr[i];
        }
    }
    return thirdLargest;
}


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,7};
        int index = arr.length;
        System.out.println(thirdLargest(arr,index));
    }
}
