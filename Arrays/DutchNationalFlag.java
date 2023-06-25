package Arrays;
public class DutchNationalFlag {
    static void dutchNF(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
         while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;

                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        dutchNF(arr);
        for(int i:arr){
            System.out.print(i+" ");
            }
    }
}
