package Week2.day2;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class _08String {
    public static void main(String[] args) {
//        creation
        String name = "Jenja";
        char[] letters = {'J', 'e', 'n', 'y', 'a'};
        String name2 = new String(letters);
        String name3 = new String("Jenya");

        int[] nums  = ArrayUtils.createAndFillArray(10);
        System.out.println(letters);

    }
}
