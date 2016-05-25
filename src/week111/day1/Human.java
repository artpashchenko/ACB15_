package week111.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 21.05.16
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 */
public class Human {
// fields

   String name;
    int age;
    String sex;
    int height;
    int weight;

    public Human(String name, int age, String sex, int height, int weight){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String asString () {
        return String.format("Name - %s, age - %d, height - %d", name, age, height);


    }
          
}
