package autowire;

/**
 * Created by IntelliJ IDEA.
 * User: rajith
 * Date: Sep 8, 2010
 * Time: 12:12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
