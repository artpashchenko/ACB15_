package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 04.05.16
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class _FirstHalfStr1 {
    public static void main(String[] args) {
        //String str = new String("Heello");
        //String str = new String("ab");
        String str = new String("HiiH");
        
        String firstHalf = str.substring(0, (str.length()/2));
        System.out.println(firstHalf);
    }
}
