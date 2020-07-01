// sort arrays of 0s 1s and 2s without extra space
public class SortArrayNoSpace {
    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val+", ");
        }
    }

    //ts O(n) -> n is length of arr
    public static void DutchFlagAlgorithm(int[] arr) {
        if(arr.length == 0 ) {
            System.out.println("No Array");
            return;
        };
        int pointer1 = 0, pointer2 = 0, pointer3 = arr.length - 1;

        while(pointer2 <= pointer3){
            if(arr[pointer2] == 0){
                arr[pointer1] = arr[pointer1] + arr[pointer2];
                arr[pointer2] = arr[pointer1] - arr[pointer2];
                arr[pointer1] = arr[pointer1] - arr[pointer2];

                pointer1++;
                pointer2++;
            } else if(arr[pointer2] == 1) {
                pointer2++;
            } else if(arr[pointer2] == 2) {
                arr[pointer2] += arr[pointer3];
                arr[pointer3] = arr[pointer2] - arr[pointer3];
                arr[pointer2] = arr[pointer2] -arr[pointer3];

                pointer3--;
                pointer2++;
            }
        }

        printArray(arr);

    }

    // o(n) -> n is length of array
    public static void sort(int[] arr) {
        if(arr.length == 0) {
            System.out.println("No array elements");
            return;
        };

        int num0 = 0, num1 = 0, num2 = 0;
        for(int val: arr){
            if(val == 0){
                num0++;
            } else if (val == 1){
                num1++;
            } else if(val ==2){
                num2++;
            }
        }
        int i =0;
        while(num0 > 0){
            arr[i] = 0;
            num0--;
            i++;
        }
        while(num1 > 0){
            arr[i] = 1;
            num1--;
            i++;
        }
        while(num2 > 0){
            arr[i] = 2;
            num2--;
            i++;
        }

        printArray(arr);
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,2,2,1,0,0,1};

        SortArrayNoSpace.sort(arr);
        SortArrayNoSpace.DutchFlagAlgorithm(arr);
    }
}
