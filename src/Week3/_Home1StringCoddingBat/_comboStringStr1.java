package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 04.05.16
 * Time: 15:00
 * To change this template use File | Settings | File Templates.
 */
public class _comboStringStr1 {
    public static void main(String[] args) {

        String b = new String("Hello");
        String a = new String("ab");
        
        if (a.length() > b.length()){
            System.out.println(b+a+b);
        }else{
            System.out.println(a+b+a);
        }
    }
}
