package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 11:07
 * To change this template use File | Settings | File Templates.
 */
public class _01PostPreUnaryOp {
    public static void main(String[] args) {
        int a = 25;
        int b = a++;
//        take a -> b = a -> add 1 to a -> rewrite a
        System.out.println("A = " + a);
        System.out.println("B = " + b);


        int c = 25;
        int d = ++c;
//        take c -> add 1 to c -> rewrite c ->    d = c
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
