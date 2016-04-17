package Week1.day2;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 10.04.16
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 */
public class _10LogicalAnd {
    public static void main(String[] args) {

        int divider = 2 ;
        int salary = 50;
        int result;

        if (divider != 0 & salary / divider > 15){
            result = salary / divider;
            System.out.println(result);
        }else{
            System.out.println("divider = 0");
        }
    }
}
