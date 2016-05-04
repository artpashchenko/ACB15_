package Week3.day2;

import utils.MatrixUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 24.04.16
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class _02_OnceMoreAboutMatrix {
    public static void main(String[] args) {
//        1
        int[][] matrix = new int[5][5];
//        2
        int[][] matrix2 = {{1,2,3}, {4,5}, {6,7,8}};
//        3
        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[3];
        matrix3[1] = new int[2];
        matrix3[2] = new int[3];

        MatrixUtils.printMatrix(matrix3);
    }
}
