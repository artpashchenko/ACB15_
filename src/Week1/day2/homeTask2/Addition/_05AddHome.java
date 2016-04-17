package Week1.day2.homeTask2.Addition;

import  java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class _05AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int a = scan.nextInt();
        System.out.println("Enter 2nd value");
        int b = scan.nextInt();
        System.out.println("Enter 3rd value");
        int c = scan.nextInt();

        if (a == b | a == c | b == c){
            System.out.println("you have some equal values");
        }else{
            System.out.println("you have no equal values");
        }
    }
}
