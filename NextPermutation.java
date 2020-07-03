import java.util.Arrays;

public class NextPermutation {
//    Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

    static int findFirstLowIndex(int[] arr){
        int n = arr.length -1;
        while(n > 0){
            if(arr[n - 1] < arr[n]){
                return n-1;
            }
            n--;
        }
        return  -1;
    }

    static int findLeastBigIndex(int[] arr, int start){
        int diff = Integer.MAX_VALUE;
        int leastBigIndex = start;
        for(int i = start; i<arr.length - 1; i++){
            if(arr[i+1] - arr[i] < diff){
                diff = arr[i+1] - arr[i];
                leastBigIndex = i+1;
            }
        }

        return leastBigIndex;
    }

    static void reverse(int[] arr, int start) {
        for(int i = 0; i + start < arr.length; i++){
            int temp = arr[start + i];
            arr[start + i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2};

        int firstLowIndex = findFirstLowIndex(arr);
        System.out.println(firstLowIndex);
        if(firstLowIndex < 0){
            Arrays.sort(arr);
        } else {
            int leastBigIndex = findLeastBigIndex(arr, firstLowIndex);
            int temp = arr[firstLowIndex];
            arr[firstLowIndex] = arr[leastBigIndex];
            arr[leastBigIndex] = temp;

            reverse(arr, firstLowIndex + 1);
        }
    }
}
