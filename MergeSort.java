public class MergeSort {
    static int mergeTimes = 1;

    static  void mergeSort(int[] arr, int[] temp, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;

            // left
            mergeSort(arr, temp, start, mid);
            System.out.println(start + "=>" + mid);
            // right
            mergeSort(arr, temp, mid + 1, end);
            System.out.println(mid+1 + "=>" + end);
            //merge
            merge(arr, temp, start, mid, end);
        }
    }

    static void merge(int Arr[], int emp[], int start, int mid, int end) {


        // crawlers for both intervals and for temp
        int i = start, j = mid+1, k = start;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i <= mid && j <= end) {
            if(Arr[i] >= Arr[j]) {
                emp[k] = Arr[i];
                k += 1; i += 1;
            }
            else {
                emp[k] = Arr[j];
                k += 1; j += 1;
            }
        }

        // add elements left in the first interval
        while(i <= mid) {
            emp[k] = Arr[i];
            k += 1; i += 1;
        }

        // add elements left in the second interval
        while(j <= end) {
            emp[k] = Arr[j];
            k += 1; j += 1;
        }

        // copy temp to original interval
        for(i = start; i <= end; i += 1) {
            Arr[i] = emp[i];
        }
    }

    static void printArray(int arr[]) {
        for(int val: arr){
            System.out.print(val + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,10,8,9};
        int[] temp = new int[arr.length];

        mergeSort(arr, temp, 0, arr.length-1);
        printArray(arr);
    }
}