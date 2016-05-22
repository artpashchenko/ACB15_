package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 09.05.16
 * Time: 19:19
 * To change this template use File | Settings | File Templates.
 */
public class _twoLastStr1 {
    public static void main(String[] args) {
        String str = "kolala";
        String last = str.substring(str.length()-1, str.length());
        System.out.println(last);
        String preLast = str.substring(str.length()-2, str.length()-1);
        System.out.println(preLast);
        System.out.println(str.substring(0,str.length()-2) + last + preLast);

        System.out.println(str.substring(str.length()-2));
        System.out.println(str.substring(0,2));
    }
}
