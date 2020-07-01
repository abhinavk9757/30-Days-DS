import java.util.LinkedList;

public class MergeIntervals {

    public static void printMultiArray (int[][] arr) {
        System.out.print("[ ");
        for(int val1[]: arr){
            System.out.print("[");
            for(int val2: val1){
                System.out.print(val2+",");
            }
            System.out.print("]");
        }
        System.out.println("]");
    }

    public static void printArr(int [] arr){
        for(int val: arr){
            System.out.print(val + ",");
        }
        System.out.println("");
    }

    public static Boolean isGreater(int[] a, int b[]){
        int x1 = a[0];
        int x2 = b[0];
        if(x1 > x2){
            return true;
        } else if(x1 == x2){
            int y1 = a[1];
            int y2 = b[1];
            return y1 > y2;
        }
        return false;
    }
    public static void main(String[] args) {
        // intervals -> [[1,3],[2,6],[8,10],[15,18]]
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        //sort
        for(int ctr =0; ctr < intervals.length; ctr++){
            int leastIndex = ctr;
            for(int j = ctr; j< intervals.length; j++) {
                if (isGreater(intervals[ctr], intervals[j])) {
                    leastIndex = j;
                }
            }

            int temp[] = intervals[ctr];
            intervals[ctr] = intervals[leastIndex];
            intervals[leastIndex] = temp;
        }

        LinkedList<int[]> ls = new LinkedList<>();
        ls.addFirst(intervals[0]);
        for(int ctr =1; ctr < intervals.length; ctr++){
            int[] head = ls.getLast();
            int x1 = head[0];
            int x2 = intervals[ctr][0];
            int y1 = head[1];
            int y2 = intervals[ctr][1];

            if(x2 >= x1 && x2 <= y1){
                int resX = x1;
                int resY = y1 > y2 ? y1 : y2;
                ls.removeLast();
                ls.add(new int[]{resX, resY});
            } else {
                ls.add(intervals[ctr]);
            }
        }
    }
}
