package week111.day2.Student;

import utils.MyDate;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class TDD {
    public static void main(String[] args) {
        Group group = new Group("AC0");
        Student st1 = new Student("Valera", new MyDate(1989, 12,12), 'M');

        boolean expected = true;
        boolean actual = group.addStudent(st1);

        System.out.printf("Methog name - %s, result - %s," + "expected - %s, actual - %s\n",
                "addStudent", expected == actual, expected, actual);

    }
}
