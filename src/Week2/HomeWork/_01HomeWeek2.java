package Week2.HomeWork;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 20.04.16
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 */
public class _01HomeWeek2 {
    public static void main(String[] args) {

        /*int[] nums = ArrayUtils.createRandomArray(14, 1, 34);
        ArrayUtils.printArray(nums);
        ArrayUtils.bubbleSort(nums);
        System.out.printf("Min Value is  %d , Max Value is  %d ",nums[0], nums[nums.length - 1]);*/

       int[] nums = ArrayUtils.createRandomArray(14, 1, 34);
        ArrayUtils.printArray(nums);
        ArrayUtils.findMinMaxArrayValue(nums);
        System.out.println(nums);


    }
}
