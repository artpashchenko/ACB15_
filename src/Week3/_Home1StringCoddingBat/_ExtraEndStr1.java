package Week3._Home1StringCoddingBat;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 04.05.16
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public class _ExtraEndStr1 {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str2 = new String("ab");
        String str3 = new String("Hi");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        String last2 = str.substring(str.length() - 2);
        String last22 = str2.substring(str2.length() - 2);
        String last23 = str3.substring(str3.length() - 2);

        System.out.println(last2+last2+last2);
        System.out.println(last22+last22+last22);
        System.out.println(last23+last23+last23);

        
    }
     
        
    }



