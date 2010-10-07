package mainTest;

import message.MessageImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: rajith
 * Date: Sep 7, 2010
 * Time: 2:17:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        MessageImpl msg = (MessageImpl) ctx.getBean("message");

        System.out.println("msg = " + msg);

        MessageImpl msgCons = (MessageImpl) ctx.getBean("messageConstructor");
        System.out.println("msgCons = " + msgCons);

        List<String> nameList = msg.getNameList();
        for (String s : nameList) {
            System.out.println("s = " + s);
        }

        Set<Integer> ageSet = msg.getAgeSet();

        for (Integer integer : ageSet) {
            System.out.println("integer = " + integer);
        }

        Map<String, MessageImpl> messageMap = msg.getMessageMap();
        for (Map.Entry<String, MessageImpl> entry : messageMap.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }


    }
}
