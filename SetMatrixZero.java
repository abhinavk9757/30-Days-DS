public class SetMatrixZero {


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

    public static void main(String[] args) {
        int[][] matrix = {
                {0,3,0},
                {3,0,5},
                {1,1,1}
        };

        int numRow = matrix.length;
        int numCol = matrix[0].length;
        Boolean isFrstColZero = false;

        for(int i = 0; i<numRow; i++){
            if(matrix[i][0] == 0){
                isFrstColZero = true;
            }
            for(int j= 0; j<numCol; j++ ){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i<numRow; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j<numCol; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 1; i<numCol; i++){
            if(matrix[0][i] == 0){
                for(int j = 0; j<numRow; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i = 0; i<numCol; i++){
                matrix[0][i] = 0;
            }
        }

        if(isFrstColZero){
            for(int i = 0; i< numRow; i++){
                matrix[i][0] = 0;
            }
        }

        printMultiArray(matrix);
    }
}
