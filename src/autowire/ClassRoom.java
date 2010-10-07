package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by IntelliJ IDEA.
 * User: rajith
 * Date: Sep 8, 2010
 * Time: 12:13:15 PM
 * To change this template use File | Settings | File Templates.
 */

public class ClassRoom {

    private String name;
    private Teacher mathsteacher;
    private Teacher teacher;

    public ClassRoom() {
    }

    public ClassRoom(Teacher mathsteacher, Teacher teacher) {
        this.teacher = teacher;
        this.name = "testConstructor";
        this.mathsteacher = mathsteacher;
    }

    public ClassRoom(String name, Teacher teacher, Teacher teacher1) {
        this.name = name;
        this.mathsteacher = teacher;
        teacher = teacher1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getMathsteacher() {
        return mathsteacher;
    }

//    @Autowired
//    @Qualifier("teacher")
    @Resource
    public void setMathsteacher(Teacher mathsteacher) {
        this.mathsteacher = mathsteacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

//    @Autowired
//    @Qualifier("mathsteacher")
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", mathsteacher=" + mathsteacher +
                ", teacher=" + teacher +
                '}';
    }
}
