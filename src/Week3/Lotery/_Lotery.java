package Week3.Lotery;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 24.04.16
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
public class _Lotery {
    public static void main(String[] args) {
        int[] lotteryNumbers = LotteryUtils.generateLottery();
        ArrayUtils.printArray(lotteryNumbers);
        /*int[] lotteryTicket = LotteryUtils.createTicket();
        ArrayUtils.bubbleSort(lotteryNumbers);
        int guessNumbers = LotteryUtils.compareNumbers(lotteryNumbers, lotteryTicket);
        LotteryUtils.printCongrats(guessNumbers);*/
    }
}
