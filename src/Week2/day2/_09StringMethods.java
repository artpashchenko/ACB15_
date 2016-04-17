package Week2.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class _09StringMethods {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);
        
        String name = "Jenya";
        String name2 = "Jenya";
        System.out.println(name == name2);
        String name3 = new String("Jenya");
        System.out.println(name == name3);
        
        boolean  equals = name.equals(name3);
        System.out.println(equals);
    }
}
