package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 06.05.16
 * Time: 11:37
 * To change this template use File | Settings | File Templates.
 */
public class _middleThreeStr1 {
    public static void main(String[] args) {
        String str = "12345LoP54321";
        int length = str.length();
        System.out.println(length);
        int halfLength = length / 2;
        System.out.println(halfLength);
        
        String substr = str.substring(halfLength-1, halfLength+2);
        System.out.println(substr);
        
    }
}
