package utils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class MyDate {

    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public MyDate(int yearBirth, int monthBirth, int dayBirth) {
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public String asString(){
        return String.format("%d,%d,%d", dayBirth, monthBirth, yearBirth);
    }
}
