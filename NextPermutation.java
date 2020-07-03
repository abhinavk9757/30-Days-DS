import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        Boolean nextPermFound = false;
        int indexNum = 0;
        for( int i = arr.length - 1; i > 0; --i){
            if(arr[i - 1] < arr[i]){
                nextPermFound = true;
                indexNum = i-1;
                break;
            }
        }
        if(nextPermFound){
            Boolean lowerDigitFound = false;
            int lowerDigitIndex = 0;
            for(int i = indexNum; i< arr.length; i++){

            }
        } else {
            Arrays.sort(arr);
        }
    }
}
