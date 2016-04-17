package Week1.day2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 13:05
 * To change this template use File | Settings | File Templates.
 */
public class _09ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
//        if(condition) {
//            if condition == true ->
//            logic
//          }
        /*if (age >= 18) {
            System.out.println(name + " is Adult");
        } else if (age > 60) {
            System.out.println(name + " to old");
        }  else {
            System.out.println(name + " is to young");
        }
*/
        if (age < 18 | age > 60) {
            System.out.println("good bye");
        }else {
            System.out.println("norm");
        }
    }

}
