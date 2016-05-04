package Week3.day1;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
public class _03TestStringSort {
    public static void main(String[] args) {
        String[] array = {"Apple", "Zoo", "Orange", "Cinema"};
        ArrayUtils.printArray(array);
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);
    }
}
