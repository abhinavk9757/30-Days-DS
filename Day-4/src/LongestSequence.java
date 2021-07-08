import java.util.HashSet;

public class LongestSequence {
    public static void main(String[] args) {
        int arr[] = {100,4, 200, 1, 3, 2};
        optimizedBruteForce(arr);

//        Arrays.sort(arr);
//        int currMax = 0;
//        int overAllMax=0;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i+1] != arr[i] && arr[i+1]-1 == arr[i]){
//                currMax++;
//                if(currMax > overAllMax){
//                    overAllMax = currMax;
//                }
//            } else if(arr[i] != arr[i+1] && arr[i+1]-1 != arr[i]){
//                currMax=0;
//            }
//        }
//
//        System.out.println("Array Sort " + (overAllMax+1));
    }

    public static void optimizedBruteForce(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int val: arr){
            hs.add(val);
        }
        int longestStreak = 0;
        for(int i=0; i<arr.length ;i++){
            int currVal = arr[i];
            int currStreak = 1;
            while(hs.contains(currVal+1)){
                currStreak++;
                currVal++;
            }

            longestStreak = Math.max(currStreak, longestStreak);
        }

        System.out.println(longestStreak);
    }
}
