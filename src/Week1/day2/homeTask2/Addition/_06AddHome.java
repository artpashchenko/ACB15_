package Week1.day2.homeTask2.Addition;
import  java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 */
public class _06AddHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed in meters per second");
        int speed = scan.nextInt();
        System.out.println("Enter distance in meters");
        int distance = scan.nextInt();

        int time = distance / speed;
        if(time < 60){
            System.out.println("Your time is:  " + time + "   seconds");
        }else  if (time > 60 && time < 3600){
            int minutes = time / 60;
            System.out.println("Your time is:  " + minutes + "  minutes  " + (time % 60) + " seconds");
        }else if (time > 3600){
            int hours = time / 3600;
            int minutes = (time % 3600) / 60;
            int seconds = ((time % 3600) % 60) % 60;
            System.out.println("Your time is:  " + hours + "  hours  " +
                               minutes + "  minutes  " + (seconds) + "  seconds");
        }else {
            System.out.println("wrong value");
        }


    }
}
