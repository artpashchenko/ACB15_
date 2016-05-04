package utils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class MatrixUtils {
    public  static int[][] createAndFillMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public  static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%-2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
