public class RotateMatrix {
    public static void printMultiArray (int[][] arr) {
        System.out.println("[ ");
        for(int val1[]: arr){
            System.out.print("  [");
            for(int val2: val1){
                System.out.print(val2+",");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    // O(n^2)
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
         for (int i = 0; i < n; i++) {
           for (int j = i; j < n; j++) {
             int tmp = matrix[j][i];
             matrix[j][i] = matrix[i][j];
             matrix[i][j] = tmp;
           }
         }

        for(int i =0; i<n; i++){
            int[] row = matrix[i];
            for(int j = 0; j<n/2; j++){
                int tmp = row[j];
                row[j] = row[n -1 - j];
                row[n -1 - j] = tmp;
            }
        }

        printMultiArray(matrix);
    }
}
