package mainTest;

import autowire.ClassRoom;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by IntelliJ IDEA.
 * User: rajith
 * Date: Sep 8, 2010
 * Time: 12:17:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AutoWireTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        ClassRoom classRoom = (ClassRoom) ctx.getBean("classRoom");
        System.out.println("classRoom = " + classRoom);

        ClassRoom classRoom1 = (ClassRoom) ctx.getBean("classRoom1");
        System.out.println("classRoom1 = " + classRoom1);

        ClassRoom classRoom2 = (ClassRoom) ctx.getBean("classRoom2");
        System.out.println("classRoom2 = " + classRoom2);

    }
}
