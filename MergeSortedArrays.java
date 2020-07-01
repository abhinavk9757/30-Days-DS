
import java.util.Arrays;

public class MergeSortedArrays {
    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val+", ");
        }
    }

    //tc - log(m+n)
    static void naiveSolve(int[] arr1, int[] arr2){

        for(int ctr = 0; ctr < arr2.length;ctr ++){
            arr1[arr2.length + ctr] = arr2[ctr];
        }
        Arrays.sort(arr1);
        printArray(arr1);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,0,0,0,0,0};
        int[] arr2 = {1,2,3,4,5};

        naiveSolve(arr1, arr2);
    }
}
