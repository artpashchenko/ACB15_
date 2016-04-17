package Week1.day2;


import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 12:37
 * To change this template use File | Settings | File Templates.
 */
public class _07Scanner {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();

        System.out.println( "Your name is: " + name + "\n" + "Your age is: " + age);

    }
}
