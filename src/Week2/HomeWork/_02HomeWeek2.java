package Week2.HomeWork;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 20.04.16
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class _02HomeWeek2 {
    public static void main(String[] args) {
        int[] nums   = ArrayUtils.createRandomArray(4,1,10);
        ArrayUtils.printArray(nums);
        ArrayUtils.findArithmeticalMean(nums);
        System.out.println(ArrayUtils.findArithmeticalMean(nums));

    }
}
