package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 06.05.16
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class _hasBadStr1 {
    public static void main(String[] args) {
        String str = "bad";
       // String example = "bad";

        if (str.length() < 3)
            System.out.println(false);

        if (str.length() == 3 && str.equals("bad")) {
            System.out.println(false);
        }

        if (str.length() > 3) {
            if (str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad")) {
                System.out.println(true);
            }
        }

        System.out.println(false);
    }

    }

