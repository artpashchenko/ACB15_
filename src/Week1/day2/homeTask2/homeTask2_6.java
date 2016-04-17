package Week1.day2.homeTask2;

import  java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int val1 = scan.nextInt();
        System.out.println("Enter 2nd value:");
        int val2 = scan.nextInt();

        int sum = val1 + val2;
        if (sum > 11 & sum < 19){
            System.out.println(sum);
        }else {
            System.out.println("Sum is out of range (11 to 19)");
        }
    }
}
