package Week2.day2;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */
public class _06SimpleSort {
    public static void main(String[] args) {
        char[] letters = {'d','a', 'c', 'b'};
        for (int i = 0; i < letters.length-1; i++){
            if (letters[i] > letters[i + 1]) {
//                swap
                char tmp = letters[i+1];
                letters[i+1]  = letters[i];
                letters[i] = tmp;
            }
        }
        Arrays.sort(letters);
        ArrayUtils.printArray(letters);
                
    }
}
