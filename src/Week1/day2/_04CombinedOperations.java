package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class _04CombinedOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        
        int c = 0;
        int d = -56;
        
        boolean answer1  = a > b;
        boolean answer2 = c != d;

        System.out.println(answer1 | answer2);
    }
}
