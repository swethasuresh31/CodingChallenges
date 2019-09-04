import java.util.HashMap;
import java.util.HashSet;

public class MatrixRowColZero {

    public void makeRowColZero(int[][] matrix){
        printMatrix(matrix);
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col <matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col <matrix[row].length; col++){
                if(rowSet.contains(row) || colSet.contains(col)){
                matrix[row][col] = 0;
                }
            }
        }

        printMatrix(matrix);

    }

    public void printMatrix(int[][] matrix){
        for(int i =0; i<matrix.length; i++){
            System.out.print("|");
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(" " +matrix[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{1,0,2},{0,2,3}};
        MatrixRowColZero obj = new MatrixRowColZero();
        obj.makeRowColZero(matrix);
    }
}
