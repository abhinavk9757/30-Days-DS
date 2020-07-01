public class KadaneAlgo {
    public static void reKadane() {
        int a[] = {-1,2,3,-4,5,6};
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
              max_ending_here = Math.max(max_ending_here + a[i], a[i]);
              max_so_far = Math.max(max_so_far, max_ending_here);
        }

        System.out.println(max_so_far);
    }

    public static void main(String[] args) {
        reKadane();
    }
}
