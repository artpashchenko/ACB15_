package Week1.day2.homeTask2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 18:31
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter current hour (0 to 24) ");
        int hour  = scan.nextInt();

        if (hour >= 9 && hour <=18){
            System.out.println(" I'm at work");
        }else{
            System.out.println("I'm relaxing!");
        }
    }
}
