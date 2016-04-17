package Week2.day2;

import utils.ArrayUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 17.04.16
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
public class _05WorkWithArrays {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c'};
        char letter = 'd';
        char[] newLetters = new char[letters.length +1];
        
        /*newLetters[0] = letters[0];
        newLetters[1] = letters[1];
        newLetters[2] = letters[2];
        newLetters[3] = letter;*/
        
       /* for (int i = 0; i < letters.length; i++){
            newLetters[i] = letters[i];
        }
        newLetters[letters.length] = letter;*/

        System.arraycopy(letters, 0, newLetters, 0, letters.length);
        newLetters[letters.length] = letter;

        ArrayUtils.printArray(newLetters);

    }
}
