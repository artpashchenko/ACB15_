package week111.day2.Student;

import utils.MyDate;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */

public class Student {

    private String name;
    private MyDate birthDay;
    private double averageMark;
    private char gender;

    public Student(String name, MyDate birthDay, char gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.averageMark = averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public MyDate getBirthDay() {

        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public char getGender() {
        return gender;
    }

    public String asString(){
        return String.format("%s, BD - %s, aver mark - %.1f",name, birthDay.asString(), averageMark);
    }
}



