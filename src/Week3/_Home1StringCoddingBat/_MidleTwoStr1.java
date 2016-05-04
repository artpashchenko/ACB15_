package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 04.05.16
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class _MidleTwoStr1 {
    public static void main(String[] args) {
       // String str = new String("Heello");
      // String str = new String("ab");
        String str = new String("HiiH");
        
        String mi1 = str.substring(((str.length() / 2) - 1), (str.length() / 2));
        System.out.println(mi1);

        String mi2 = str.substring((str.length() / 2), (str.length() / 2) + 1);
        System.out.println(mi2);

        System.out.println(mi1+mi2);
    }
}
