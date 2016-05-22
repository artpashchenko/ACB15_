package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 06.05.16
 * Time: 10:44
 * To change this template use File | Settings | File Templates.
 */
public class _nTwiceStr1 {
    public static void main(String[] args) {
        String str = new String("Hello");
        //String str = new String("sobaka");
        //String str = new String("babboocha");
        int n = 2;

        String firstThree = str.substring(0, n);
        String lastThree = str.substring(str.length() - n);

        System.out.println(firstThree);
        System.out.println(lastThree);
        System.out.println(firstThree + lastThree);
    }
}
