package Week1.day2.homeTask2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = sc.nextDouble()     ;
        if (num % 7 == 0 & num != 0){
            System.out.println(num * 2);
        }
    }
}
