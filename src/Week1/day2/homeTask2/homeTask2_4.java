package Week1.day2.homeTask2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value with (swimming) point");
        double swimPnt = scan.nextDouble();

        if (swimPnt > 0 & swimPnt < 1){
            System.out.println("Your value is (0 to 1)");
        } else {
            System.out.println("Your value is out of range");
        }
    }
}
