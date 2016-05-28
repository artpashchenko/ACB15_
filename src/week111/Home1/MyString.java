package week111.Home1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 25.05.16
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class MyString {

    private char[] charArray;

    public MyString(String string) {
        if (string == null) {
            this.charArray = null;
        }
        this.charArray = string.toCharArray();
    }


    public MyString(char[] characters) {
        if (characters == null) {
            this.charArray = null;
        }
        this.charArray = characters;
    }

    public int length() {
        return charArray.length;
    }

    public void printMyString() {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
// todo
//    public MyString concat(MyString nextString) {
    public MyString concat(String nextString) {
        if (nextString == null) {
            return new MyString(charArray);
        }
        char[] bothStrings = new char[this.length() + nextString.length()];
        MyString united = new MyString(bothStrings);
        System.arraycopy(this.charArray, 0, united.charArray, 0, this.length());
        System.arraycopy(nextString.toCharArray(), 0, united.charArray, this.length(), nextString.length());

        return united;
    }

    public MyString toLowerCase() {

        char[] lowerCase = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            lowerCase[i] = Character.toLowerCase(charArray[i]);
        }

        return new MyString(lowerCase);
    }

    public MyString toUpperCase() {

        char[] upper = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            upper[i] = Character.toUpperCase(charArray[i]);
        }

        return new MyString(upper);
    }
// todo String -> MyString
    public boolean contains(String yourString) {

        if (yourString == null || this.length() < yourString.length()) {
            return false;
        }
//        boolean answer = false;
        for (int i = 0; i < this.length(); i++) {
            char[] yourCharArray = yourString.toCharArray();
            if (charArray[i] == yourCharArray[0]) {
                if ((this.length() - i) < yourString.length()) {
                    return false;
                }
                for (int j = 0; j < yourString.length() - 1; j++) {
                    if (this.charArray[i + j] != yourCharArray[j]) {
//                        answer = true
                       return false;
                    }
                }
            }

        }
        return true;
    }


    public MyString subMyString(int firstIndex, int lastIndex) {
        int newLength = lastIndex - firstIndex + 1;
        char[] array = new char[newLength];
        System.arraycopy(this.charArray, firstIndex, array, 0, newLength);
        return new MyString(array);
    }

    public MyString subMyString(int firstIdex) {
        int newLength = this.length() - firstIdex;
        char[] array = new char[newLength];
        for (int i = 0; i < newLength || firstIdex <= newLength; i++, firstIdex++) {
            array[i] = this.charArray[firstIdex];
        }
        return new MyString(array);
    }

    public MyString trim() {

        int firstIndex = 0;
        int lastIndex = charArray.length - 1;

        while (charArray[firstIndex] == ' ') {
            firstIndex++;
            if (firstIndex == lastIndex)
                return new MyString(new char[0]);
        }

        while (charArray[lastIndex] == ' ') {
            lastIndex--;
        }

        return new MyString(charArray).subMyString(firstIndex, lastIndex + 1);
    }

    public boolean equals(MyString yourString) {
        if (this == yourString) {
            return true;
        }
        if (yourString == null || this.length() != yourString.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.charArray[i] != yourString.charArray[i]) {
                return false;
            }
        }
        return true;
    }

    public char charAt(int index) {
        if (index < 0 || index > this.length()) {
            return 0;
        } else {
            for (int i = 0; i < this.length(); i++) {
                if (i == index) {
                    return charArray[i];
                }
            }
        }
        return 0;
    }


}


