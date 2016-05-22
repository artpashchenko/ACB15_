package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 06.05.16
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class _twoCharStr1 {
    public static void main(String[] args) {
        String str = "java";
        int index = -1;

        int lengthStr = str.length();

        if (lengthStr > index && lengthStr >= (index +2) && index > 0){
            System.out.println(str.substring(index, index + 2));
        }  else{
                System.out.println(str.substring(0, 2));
            }
    }
}
