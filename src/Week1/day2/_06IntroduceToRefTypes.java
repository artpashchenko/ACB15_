package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class _06IntroduceToRefTypes {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'r';
        char c = 't';
        char d = 'e';
        char e = 'm';
        System.out.println("My name is " + a + b + c + d + e);
        
//        1) <type><name> = "<value>";
//        2) String <name> = new String("<value>");
        
        String name = "Artem";
        System.out.println(name);
        String name2 = new String("Artem");
    }
}
