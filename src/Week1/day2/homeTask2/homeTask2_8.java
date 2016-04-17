package Week1.day2.homeTask2;

import  java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 19:50
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st value");
           int val1 = scan.nextInt();

        System.out.println("Enter 2nd value");
           int val2 = scan.nextInt();

        int lastnum1 = val1 % 10;
        int lastnum2 = val2 % 10;

        System.out.println("Last digit of (Value 1) =    " + lastnum1);
        System.out.println("Last digit of (Value 2) =    " + lastnum2);

        if (lastnum1 == lastnum2){
            System.out.println("" + val1 + "   " + val2 + "  -  true");
        }else{
            System.out.println("" + val1 + "   " + val2 + "  -  false");
        }


    }
}
