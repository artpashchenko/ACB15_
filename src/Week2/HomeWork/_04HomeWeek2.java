package Week2.HomeWork;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.04.16
 * Time: 7:42
 * To change this template use File | Settings | File Templates.
 */
public class _04HomeWeek2 {
    public static void main(String[] args) {
        int[] nums1 = ArrayUtils.createRandomArray(22, 2, 23);
        ArrayUtils.printArray(nums1);
        int[] nums2 = ArrayUtils.createRandomArray(22, 3, 44);
        ArrayUtils.printArray(nums2);
        int[] nums2new = ArrayUtils.arrayToOtherArray(nums1, nums2);
        ArrayUtils.printArray(nums2new);
    }
}
