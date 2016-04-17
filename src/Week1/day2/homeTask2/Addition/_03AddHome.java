package Week1.day2.homeTask2.Addition;

import  java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 13.04.16
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */
public class _03AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three digit value!");
        int value1 = scan.nextInt();

        int num1 = value1 / 100;
        int num2 = (value1 % 100) / 10;
        int num3 = value1 % 10;

        if (num1 == num2 && num2 == num3 ){
            System.out.println("Each digit of your value are the same");
        }else if (num1 == num2 | num2 == num3 | num1 == num3){
            System.out.println("Some digits in your value are the same");
        } else {
            System.out.println("There is no same digits in your value");
        }

    }
}
