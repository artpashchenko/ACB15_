package Week3.HomeMatrix1;

import utils.MatrixUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 21.05.16
 * Time: 9:16
 * To change this template use File | Settings | File Templates.
 */
public class _matr5to8 {
    public static void main(String[] args) {
       int[][] matrix = MatrixUtils.createRandomMatrixByUser();
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
               if  (matrix[i][j] % 5 == 0){
                   matrix[i][j] = 8;
               }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        MatrixUtils.printMatrix(matrix);
    }
}
