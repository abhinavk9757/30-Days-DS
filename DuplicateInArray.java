import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    // O(n) n -> length of array
    public static void removeDuplicates(String[] arrWithDuplicates){
        int length = arrWithDuplicates.length;
        if(length == 0){
            System.out.println("No Array");
            return;
        }

        ArrayList<String> noDuplicates = new ArrayList<>();
        for(String val: arrWithDuplicates){
            if(!noDuplicates.contains(val)){
                noDuplicates.add(val);
            }
        }

        System.out.println("With ArrayList -> " + noDuplicates);
    }

    public static void removeDuplicatesWithSet(String[] arrWithDuplicates){
        if(arrWithDuplicates.length == 0) {
            System.out.println("No array");
        } else {
            Set<String> noDuplicate = new HashSet<>(Arrays.asList(arrWithDuplicates));
            System.out.println("With hash set -> " + noDuplicate);
        }
    }

    // tc -> O(n) , n -> length or array
    public static void removeDuplicatesFromSorted(int[] arrWithDuplicates){
        if(arrWithDuplicates.length == 0) System.out.println("No array");
        int val = 0;
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for(int ctr = 0; ctr< arrWithDuplicates.length; ctr++){
            if(ctr == 0 || arrWithDuplicates[ctr] != val){
                noDuplicates.add(arrWithDuplicates[ctr]);
                val = arrWithDuplicates[ctr];
            }
        }

        System.out.println("Sorted Array of duplicates -> " + noDuplicates);
    }

    public static void main (String args[]){
        String arrWithDuplicates[] = new String[]{
            "a", "b", "c", "a", "b", "c"
        };

        //unsorted array duplicates
        DuplicateInArray.removeDuplicates(arrWithDuplicates);
        DuplicateInArray.removeDuplicatesWithSet(arrWithDuplicates);

        //sorted array duplicates
        int sortedDuplicates[] = new int[]{1,1,1,1,2,2,2,4,4,4,4};
        DuplicateInArray.removeDuplicatesFromSorted(sortedDuplicates);
    }
}