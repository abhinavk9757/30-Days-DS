import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static int calculateLongestSubArray(int arr[]){
        int longestSubArrayLength = 0;
        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            int currLength = 1;
            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];
                currLength++;
                if(sum==0 && longestSubArrayLength<currLength) {
                    longestSubArrayLength = currLength;
                }
            }
        }
        return longestSubArrayLength;
    }
    public static int subArraySumWithHash(int[] nums) {
        int count = 0, sum = 0, longestInterval = 0;
        HashMap< Integer, Integer > cumulativeSum = new HashMap < > ();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(!cumulativeSum.containsKey(sum)){
                longestInterval = Math.max(longestInterval, i-cumulativeSum.get(sum));
            } else {
                cumulativeSum.put(sum, i);
            }
        }
        return longestInterval;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,0,0,0,4};
//        System.out.println(calculateLongestSubArray(arr));
        System.out.println(subArraySumWithHash(arr));
    }
}

//[1,2,-4,-3,5,6,-5]
