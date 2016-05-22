package Week3.HomeMatrix1;

import utils.MatrixUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 21.05.16
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class _booleanMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = MatrixUtils.createRandomMatrixByUser();
        MatrixUtils.printMatrix(matrix1);


        boolean[][] boolmatr = MatrixUtils.changeIntMatrixToBoolean(13) ;

        MatrixUtils.printMatrix(boolmatr);
    }
    



}
