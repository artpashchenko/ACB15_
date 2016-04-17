package Week1.day2.homeTask2.Addition;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 12.04.16
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
public class _02AddHome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Value:  ");
        int val1 = scan.nextInt();
        System.out.println("Enter 2nd Value:   ");
        int val2 = scan.nextInt();
        System.out.println("Enter 3rd Value:   ");
        int val3 = scan.nextInt();

        if (val1 > 0) {
            int pow1 = (val1 * val1 * val1);
            System.out.println(" Val 1 is positive, pow1^ 3 =     " + pow1);
        } else if (val1 < 0) {
            val1 = 0;
            System.out.println(" Val 1 is negative, replaced with zero, Val 1 =   " + val1);
        } else {
            System.out.println(" Wrong Value or Zero!");
        }


        if (val2 > 0) {
            int pow2 = (val2 * val2 * val2);
            System.out.println(" Val 2 is positive, pow2^ 3 =     " + pow2);
        } else if (val2 < 0) {
            val2 = 0;
            System.out.println(" Val 2 is negative, replaced with zero, Val 2 =   " + val2);
        } else {
            System.out.println(" Wrong Value or Zero!");
        }


        if (val3 > 0) {
            int pow3 = (val3 * val3 * val3);
            System.out.println(" Val 3 is positive, pow3^ 3 =     " + pow3);
        } else if (val3 < 0) {
            val3 = 0;
            System.out.println(" Val 3 is negative, replaced with zero, Val 3 =   " + val3);
        } else {
            System.out.println(" Wrong Value or Zero!");
        }
    }
}
