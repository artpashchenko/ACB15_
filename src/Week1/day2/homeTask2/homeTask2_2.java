package Week1.day2.homeTask2;

import  java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int value1 = scan.nextInt();
        System.out.println("Enter 2nd value:");
        int value2 = scan.nextInt();
        System.out.println("Enter 3rd value:");
        int value3 = scan.nextInt();


        if (value1 > value2 & value1 > value3){
            System.out.println("The biggest value is: " + value1);
        }else if (value2 > value1 & value2 > value3){
            System.out.println("The biggest value is: " + value2);
        }else{
            System.out.println("The biggest value is: " + value3);
        }

        if (value1 < value2 & value1 < value3){
            System.out.println("The lowest value is: " + value1);
        }else if (value2 < value1 & value2 < value3){
            System.out.println("The lowest value is: " + value2);
        }else{
            System.out.println("The lowest value is: " + value3);
        }
        
    }
}
