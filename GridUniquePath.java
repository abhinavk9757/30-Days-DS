public class GridUniquePath {

    static int findUniquePath(int currRow, int currCol){
        if(currRow == 1 || currCol == 1){
            return 1;
        }

        return findUniquePath(currRow -1, currCol) + findUniquePath(currRow, currCol-1);

    }

    public static void main(String[] args) {
        int numRows = 3;
        int numCol = 7;
        int uniquePath = findUniquePath(numRows, numCol);
        System.out.println("Number of unique paths -> " + uniquePath);
    }
}