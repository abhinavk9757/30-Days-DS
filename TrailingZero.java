public class TrailingZero {
    public static void main(String[] args) {
        int n = 30;
        int trailZero = 0;
        while ( n > 0 ){
            n = n/5;
            trailZero += n;
        }

        System.out.println(trailZero);
    }
}