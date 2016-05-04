package Week3.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public class _01StringCreation {
    public static void main(String[] args) {
//        1
        String name = "Jenya";
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(name);
        System.out.println(array);
        char[] letters = {'a', 'b'};
        System.out.println(letters);
//        2
        String word = new String(letters);
//        3
        String  name2 = new String("Jenya");

    }
}
