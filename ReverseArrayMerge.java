public class ReverseArrayMerge {
    static void mergeSort(int arr[], int temp[], int start, int end){
        if(start<end){
            int mid = (start + end)/2;

            // left
            mergeSort(arr, temp, start, mid);

            //right
            mergeSort(arr, temp, mid+1, end);

            //merge
            merge(arr, temp, start, mid, end);
        }
    }

    static void merge(int arr[], int temp[], int start, int mid, int end){
        int i = start, j = mid+1, k=start;
        while(j <= end){
            temp[k] = arr[j];
            k++;
            j++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        for(k = start; k<=end; k++){
            arr[k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,4,5,6};
        int temp[] = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);

        for(int val: arr){
            System.out.print(val + ", ");
        }
    }
}
