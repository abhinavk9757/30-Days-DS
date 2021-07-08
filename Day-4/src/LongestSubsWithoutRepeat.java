import java.util.HashSet;

public class LongestSubsWithoutRepeat {
    static int longestSubstring(String s){
        int result = 0;
        int anchor = 0, pointer=0;
        int n = s.length();
        HashSet<Character> chars = new HashSet<>();

        while(pointer<n && anchor<n){
            if(!chars.contains(s.charAt(pointer))){
                chars.add(s.charAt(pointer));
                pointer++;
                result = Math.max(result, pointer-anchor);
            } else {
                chars.remove(s.charAt(anchor));
                anchor++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaabbcbcde";
        System.out.println(longestSubstring(s));
    }
}
