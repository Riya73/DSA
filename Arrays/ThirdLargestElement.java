public class ThirdLargestElement {
    public static int largest(int[] arr, int index){
        for(int i = 0; i<index; i++){
            for(int j = i+1; j<index; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[index-3];
    }

    public static void main(String[] args) {
        int[] arr = {12, 14, 19, 11, 32};
        int index = arr.length;
        System.out.println(largest(arr,index));
    }
}
