package utils;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class MatrixUtils {
    public static int[][] createAndFillMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(boolean[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createRandomMatrixByUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = scan.nextInt();
        System.out.println("Enter columns:");
        int columns = scan.nextInt();
        System.out.println("Enter min matrix value:");
        int min = scan.nextInt();
        System.out.println("Enter max matrix value:");
        int max = scan.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (min + Math.random() * (max - min));
            }
        }
        return matrix;

    }

    public static boolean[][] changeIntMatrixToBoolean(int size) {


        boolean[][] matrix = new boolean[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = true;
                } else {
                    matrix[i][j] = false;
                }
            }
        }


        return matrix;


    }


}
