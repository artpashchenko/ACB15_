package Week2.day2;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class _03SocialNetworl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "admin";
        int pass = 123456;
        
        while (true){
            System.out.println("Enter pass");
            int inputPass = sc.nextInt();
            if(inputPass == pass){
                break;
            }
            System.out.println("Wrong pass");
        }
        System.out.println("Login");
    }
}
