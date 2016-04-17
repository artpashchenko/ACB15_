package Week2.day2;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public class _01branchingStatements {
    

    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillArray(16);
        
    /*    for (int i = 0; i < nums.length; i++){
            if(nums[i] == 6 || nums[i] == 13){
                continue;
            }
            System.out.println(nums[i]);
        }*/

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 6 || nums[i] == 13){
                i++;
                continue;
            }
            System.out.println(nums[i]);
            i++;
        }
    }
}
