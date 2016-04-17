package Week1.day2.homeTask2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int val1 = scan.nextInt();
        System.out.println("Enter 2n value");
        int val2 = scan.nextInt();

        int res1 = val1 % val2;

        if (res1 == 0){
            System.out.println("true   ," + "Divide result is: " +  (val1 / val2) + ",  modulus:  " + res1);
        }else {
            System.out.println("false   ," + "Divide result is: " +  (val1 / val2) + ",  modulus:  " + res1);
        }

        int res2 = val2 % val1;

        if (res2 == 0){
            System.out.println("true   ," + "Divide result is: " +  (val2 / val1) + ",  modulus:  " + res2);
        }else {
            System.out.println("false   ," + "Divide result is: " +  (val2 / val1) + ",  modulus:  " + res2);
        }
    }
}
