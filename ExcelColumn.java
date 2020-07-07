public class ExcelColumn {
    public static void main(String[] args) {
        String s = "AB";
        findColNum(s);
    }

    static int findColNum(String s){
        int colNum = 0;
        for(int i = s.length() - 1, j= 0; i >=0; i--, j++){
            colNum = colNum + (int)Math.pow(26, j) * (int)(s.charAt(i) - 'A' + 1);
        }

        return  colNum;
    }
}