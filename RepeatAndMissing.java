import java.util.HashSet;

public class RepeatAndMissing {

    //ts - O(n), read XOR implementation
    static void findMissing(int[] arr) {
        int missingNum = arr.length;
        for(int ctr = 0; ctr < arr.length; ctr ++){
            missingNum += (ctr - arr[ctr]);
        }

        System.out.println(missingNum);
    }

    //ts - O(n) , also read floyd's algorithm
    static void findFirstRepeating(int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int val: arr2){
            if(!hs.add(val)){
                System.out.println(val);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,3,4,2,6};
        RepeatAndMissing.findMissing(arr);

        int arr2[] = {0,1,2,2,3,3,5};
        findFirstRepeating(arr2);
    }
}
