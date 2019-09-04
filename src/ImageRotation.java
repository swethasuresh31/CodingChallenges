import java.awt.*;

public class ImageRotation {
    public void rotate(int[][] matrix) {
        //Printing initial image
        printMatrix(matrix);
        for(int level = 0; level < matrix.length/2; level++){
            int first = level;
            int last = matrix.length - 1 - level;
            for(int i = first; i<last; i++){
                int offset = i - first;
                int temp = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = temp;
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
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        ImageRotation obj = new ImageRotation();
        obj.rotate(input);
    }

}
