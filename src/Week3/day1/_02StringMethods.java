package Week3.day1;

import utils.ArrayUtils;

import java.sql.SQLOutput;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 23.04.16
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class _02StringMethods {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a == b);

        String name = "Jenya";
        String name2 = "Jenya";
        String name3 = new String("Jenya");
        System.out.println(name == name2);
        System.out.println(name == name3);
        
        boolean isEqual = name.equals(name3);
        System.out.println(isEqual);

        System.out.println(name.length());

        String word = "Hello";
        String word2 = "Helln";
       String substring = word.substring(2);
//        word = word.substring(2); - rewrite
        System.out.println(substring);
//      [start, end);
        String substring2 = word.substring(0,4);
        System.out.println(substring2);

        char[] letters = word.toCharArray();
        ArrayUtils.printArray(letters);

        System.out.println(word.toUpperCase());

        char letter = word.charAt(3);
        System.out.println(letter);

        System.out.println(word.contains("llo"));

        System.out.println(word.startsWith("llo",2 ));



        System.out.println(word.compareTo(word2));

        System.out.println(word.concat(" World!"));

        System.out.println(word.indexOf("l"));
        System.out.println(word.lastIndexOf("l"));
        System.out.println(word.trim());


        String sentence = "Hello, my name is Vova!";
        String[] words = sentence.split(", ");
        System.out.println(words[1]);
        ArrayUtils.printArray(words);


    }
}
