package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 04.05.16
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class _FirstTwoStr1 {
    public static void main(String[] args) {
    //    String str = new String("Hello");
   //    String str = new String("ab");
        String str = new String("H");
        System.out.println(str.length());

     if (str.length() >= 2){
         System.out.println(str.substring(0, 2));
     } else  {
         System.out.println(str);
     }
    }
}
