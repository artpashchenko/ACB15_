package Week3._Home1StringCoddingBat;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 06.05.16
 * Time: 10:05
 * To change this template use File | Settings | File Templates.
 */
public class _EndsLyStr1 {
    public static void main(String[] args) {
       // String str = new String("Helly");
     String str = new String("y");
       // String str = new String("alalalalylylylalq");
        String ly = new String("ly");


        
        if (str.length() > 1){
            String strLy = str.substring(str.length() - 2);
            System.out.println(str);
            System.out.println(strLy);
            boolean isEqual = strLy.equals(ly);
            System.out.println(isEqual);
        } else{
            System.out.println(false);
        }


    }
}
