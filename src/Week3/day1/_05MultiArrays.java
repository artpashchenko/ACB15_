package Week3.day1;

import utils.ArrayUtils;
import utils.MatrixUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 20:39
 * To change this template use File | Settings | File Templates.
 */
public class _05MultiArrays {
    public static void main(String[] args) {
      /*  int[] nums = ArrayUtils.createRandomArray(15, 0, 25);
        int[] nums2 = ArrayUtils.createRandomArray(15, 0, 25);

        int[][] matrix = {{0,1,2}, {3,4}, {5,6,7}};
        int[][] matrix2 = new int[3][4];
        matrix[0][0] = 5;
*/
        int[][] matrix3 = MatrixUtils.createAndFillMatrix(3, 4);
        MatrixUtils.printMatrix(matrix3);

    }
}
