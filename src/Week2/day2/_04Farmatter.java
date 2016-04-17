package Week2.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */
public class _04Farmatter {
    public static void main(String[] args) {
        double a = 15.3 / 6;
        int i = 15;
        String name = "Jenya";
       /* System.out.println(a);*/
        System.out.printf("My name is %1$s, My floating number %3$.2f !, my int is %2$d",name, i, a);

    }
}
