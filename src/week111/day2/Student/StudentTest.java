package week111.day2.Student;

import utils.MyDate;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest {

    public static void main(String[] args) {
   //     MyDate st1BD = new MyDate(1989, 01,23);

        Student st1 = new Student("Valera", new MyDate(1989, 12,12), 'M');
        Student st2 = new Student("Valesdfra", new MyDate(1989, 12,12), 'M');
        //System.out.println(st1.asString());

        Group aco13 = new Group("ACO13");
        aco13.addStudent(st1);
        aco13.addStudent(st2);

        aco13.showGroup();

    }

}
