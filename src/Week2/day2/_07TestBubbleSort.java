package Week2.day2;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
public class _07TestBubbleSort {
    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createRandomArray(10, 1,101) ;
        ArrayUtils.printArray(numbers);
        ArrayUtils.bubbleSort(numbers);
        ArrayUtils.printArray(numbers);
    }
}
