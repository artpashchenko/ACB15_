package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
public class _03LogicalOperations {
    public static void main(String[] args) {
//        boolean a and boolean b -> compare a with b
//        | - OR if one of a or b = true -> true
        boolean a = true;
        boolean b = false;
        System.out.println(a | b);
//       & - AND if both a and b = true -> return true, else -> false
        System.out.println(a & b);

//        == equals
//        if a equal b -> true, else -> falce;
        System.out.println(a == b);

    }
}
