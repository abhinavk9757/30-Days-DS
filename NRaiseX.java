public class NRaiseX {
    static double findPow(double x, long n){
        if(n==0){
            return 1;
        }

        double half = findPow(x,n/2);

        if(n %2 ==0){
            return half * half;
        } else {
            return  half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(findPow(4,3));
    }
}