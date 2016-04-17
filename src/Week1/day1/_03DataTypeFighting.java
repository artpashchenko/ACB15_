package Week1.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 09.04.16
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class _03DataTypeFighting {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;
        int age = 260;
        //casting
        byte newAge = (byte)age;
        System.out.println(newAge);
    }
}
