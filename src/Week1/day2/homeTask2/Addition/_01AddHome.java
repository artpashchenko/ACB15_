package Week1.day2.homeTask2.Addition;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 12.04.16
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class _01AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter First side of the Triangle!");
        int side1 = scan.nextInt();
        System.out.println(" Enter Second side of the Triangle!");
        int side2 = scan.nextInt();
        System.out.println(" Enter Third side of the Triangle!");
        int side3 = scan.nextInt();

        if ((side1 * side1) + (side2*side2) == (side3*side3) | (side3 * side3) + (side2*side2) == (side1*side1) |
                (side1 * side1) + (side3*side3) == (side2*side2)){
            System.out.println("Your Triangle is rectangular!");
        }else {
            System.out.println("Your Triangle is NOT rectangular!!!");
        }


    }
}
