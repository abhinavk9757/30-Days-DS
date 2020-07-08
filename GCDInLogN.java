public class GCDInLogN {

    static int gcd(int n1, int n2){
        if(n1 == 0){
            return  n2;
        }
        return gcd(n2%n1, n1);
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 15;

        System.out.println(gcd(n1, n2));
    }
}