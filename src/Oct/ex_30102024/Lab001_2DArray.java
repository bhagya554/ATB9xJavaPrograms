package Oct.ex_30102024;

public class Lab001_2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
