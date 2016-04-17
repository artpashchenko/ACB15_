package Week1.day2.homeTask2;

import java.util.Scanner;


/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 12.04.16
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class homeTask2_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three digit value!");
           int val1 = scan.nextInt();

        int modulus3 = val1 % 10;
        int val2 = val1 / 10;
        int modulus2 = val2 % 10;
        int val3 = val2 / 10;
        int modulus1 = val3 % 10;
        System.out.println("SelfCheck:   " + "mod1 = " + modulus1 + " mod 2 = " + modulus2 + " mod 3 = " + modulus3);

        if ((modulus1 & modulus2 & modulus3) == 5){
             System.out.println(" There is THREE '5'in your Value!" );
           }else if(((modulus1 & modulus2) == 5) | ((modulus3 & modulus2) == 5) | ((modulus1 & modulus3) == 5) ){
                System.out.println(" There is TWO '5' in your Value! ");
               }else if     ((modulus1 == 5) | (modulus2 == 5) | (modulus3 == 5)){
                     System.out.println(" There is ONE '5' in your Value! ");
    } else{
            System.out.println(" There is NO '5' in your Value! Enter value with '5'");
        }
 }
}