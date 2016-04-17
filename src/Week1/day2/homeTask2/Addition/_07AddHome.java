package Week1.day2.homeTask2.Addition;
import  java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 16:18
 * To change this template use File | Settings | File Templates.
 */
public class _07AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of month ( 1 - 12 )");
        int month = scan.nextInt();
        if (month == 1){
            System.out.println("Yous month is January ");
        }else if (month == 2){
            System.out.println("Yous month is February ");
        }else if (month == 3){
            System.out.println("Yous month is March ");
        }else if (month == 4){
            System.out.println("Yous month is April");
        }else if (month == 5){
            System.out.println("Yous month is May");
        }else if (month == 6){
            System.out.println("Yous month is June");
        }else if (month == 7){
            System.out.println("Yous month is July");
        }else if (month == 8){
            System.out.println("Yous month is August");
        }else if (month == 9){
            System.out.println("Yous month is September");
        }else if (month == 10){
            System.out.println("Yous month is October");
        }else if (month == 11){
            System.out.println("Yous month is November");
        }else if (month == 12){
            System.out.println("Yous month is December");
        } else {
            System.out.println("That month doesn't exist");
        }


    }
}
