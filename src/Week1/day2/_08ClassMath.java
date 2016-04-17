package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class _08ClassMath {
    public static void main(String[] args) {
        
       int a = 12;
       int c = (int) Math.pow(a, 2);
        System.out.println(c);
       int b = (int) Math.sqrt(c);
        System.out.println(b);
//        [0:1)
       int random = (int) (Math.random() * 100);
        System.out.println(random);


    }
}
