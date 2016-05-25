package week111.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 21.05.16
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {

        Human person = new Human("Vasja", 25, "man", 180, 85 );

       /* person.age = 25;
        person.name = "Vasja";*/



        System.out.println(person.getName());


        System.out.println(person.asString());
       /* String personInfo = person.asString() ;

        System.out.println(personInfo);*/

        person.setName("Kolya");
        System.out.println(person.getName());

    }



}
