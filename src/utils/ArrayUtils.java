package utils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */
public class ArrayUtils {
//              return type
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] createAndFillArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = i;
        }
        return  array;

    }
    
    public static int[] createRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (min + Math.random() * (max - min));
        }
        return  array;
    }

    public  static void bubbleSort(int[] array){
        for (int j = array.length; j > 0; j--){
            for (int i = 0; i < j - 1; i++){
                if (array[i] > array[i + 1]) {
                    int tmp = array[i+1];
                    array[i+1]  = array[i];
                    array[i] = tmp;

        }
    }
}
    }
}
