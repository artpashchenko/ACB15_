package Week3.Lotery;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 24.04.16
 * Time: 13:23
 * To change this template use File | Settings | File Templates.
 */
public class LotteryUtils {
   /* public static void printCongrats(int guessNumbers) {
    }

    public static int compareNumbers(int[] lotteryNumbers, int[] lotteryTicket) {
    }

    public static int[] createTicket() {
    }
*/
    public static int[] generateLottery() {
        int[] array = new int[6];
        for (int i = 0; i < 6; i++){
            array[i] = (int)(1 + Math.random() * (43 - 1));
            /*for (int j = 0; j < 6; j++){
                if (array[0] != array[1] && array[1] != array[2] && array[2] != array[3]
                        && array[3] != array[4] && array[5] != array[6]){
                    array[j] = (int)(1 + Math.random() * (43 - 1));
                }*/
            }   return  array;

        }

    }

