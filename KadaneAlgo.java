import java.util.HashMap;

public class KadaneAlgo {
    public static void myOwnSol(String[] args) {
        //find maximum sum subarray in an array
        int arr[] = {-1,2,3,-4,5,6};
        int maxSubArray = 0;

        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int ctr = 0; ctr<arr.length; ctr++){
            if(ctr == 0){
                HM.put(ctr, arr[ctr]);
                maxSubArray = arr[ctr];
            } else {
                int prevIndexMax = HM.get(ctr -1);
                int currVal = arr[ctr];
                int currSum = currVal + prevIndexMax;

                int currMax = Math.max(currVal, Math.max(prevIndexMax, currSum) );

                HM.put(ctr, currMax);
                if(currMax > maxSubArray){
                    maxSubArray = currMax;
                }

            }
        }
        System.out.println("Max sub array -> " + maxSubArray);
        System.out.println(HM);
    }
}
