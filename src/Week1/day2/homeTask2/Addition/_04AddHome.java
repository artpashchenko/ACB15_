package Week1.day2.homeTask2.Addition;
import  java.util.Scanner;


/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 13.04.16
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class _04AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed in km per hour:  ");
        double kmph = scan.nextDouble();
        System.out.println("Enter speed in meters per second");
        double  mps = scan.nextDouble();

        if ((kmph / 3.6) > mps){
            System.out.println("Speed in kmph is bigger than mps");
        } else {
            System.out.println("Speed in mps is bigger than kmph");
        }
    }
}
