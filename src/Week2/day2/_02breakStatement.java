package Week2.day2;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class _02breakStatement {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillArray(16);
        
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 6){
                System.out.println("inside break");
                break;

            }
            System.out.println(nums[i]);

        }
        System.out.println("outside for");
    }
}
