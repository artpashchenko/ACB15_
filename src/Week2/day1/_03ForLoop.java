package Week2.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
public class _03ForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};

//        for(<start>; <condition>; <way>)
        for (int i = 0; i < numbers.length; i++) {
//            logic
            System.out.println(numbers[i]);
        }
        
        int[] numbers2 = new int[15];
        for (int c = 0; c < numbers2.length; c++){
            numbers2[c] = c;
            System.out.println(c);
        }
        int i = 0;
        for(;;){

        }


    }

}
