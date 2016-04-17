package Week2.day1;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 19:57
 * To change this template use File | Settings | File Templates.
 */
public class _05Methods {
    public static void main(String[] args) {
        
       /* int[] nums = ArrayUtils.createAndFillArray(22);

//        public static <return type> <name> (<value type><input value>){
//
//        return <something>;
//        }
        String[] array = {"ss", "www"};
        ArrayUtils.printArray(array);
        ArrayUtils.printArray(nums);
        */
      /*  int random = (int) (25 + Math.random() * (100 - 25));
        System.out.println(random);*/

        int[] randomArray = ArrayUtils.createRandomArray(12, 3, 10);
        ArrayUtils.printArray(randomArray);

    }
}
