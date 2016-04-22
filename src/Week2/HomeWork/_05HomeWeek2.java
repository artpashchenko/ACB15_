package Week2.HomeWork;

import utils.ArrayUtils;

import java.util.Arrays;
import  java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.04.16
 * Time: 19:23
 * To change this template use File | Settings | File Templates.
 */
public class _05HomeWeek2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int num = sc.nextInt();
        int[] randomArray = ArrayUtils.createRandomArray(34, 1, 34);
        ArrayUtils.printArray(randomArray);
        ArrayUtils.findValueInArray(randomArray, num);
        System.out.println("Your Value " + num + " found " + randomArray + " times in array.");


    }
}
