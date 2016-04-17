package Week2.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */
public class _01TarnaryOperator {
    public static void main(String[] args) {
        
        int a = 5;
        String answer = "";
        if (a > 3){
           answer = "Yes";
        }else{
            answer = "no";
        }
//                        true         falce
//        <condition> ? statement1 : statement2
        answer = a > 8 ? "Yes" : a == 6 ? "Equal" : "no";
        System.out.println(answer);
    }
}
