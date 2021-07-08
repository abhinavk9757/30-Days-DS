import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> complements = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(complements.containsKey(arr[i])){
                System.out.println("Found at => " + complements.get(arr[i]) + ", " + i);
                break;
            }
            int diff = target - arr[i];
            complements.put(diff, i);
        }
    }
}
