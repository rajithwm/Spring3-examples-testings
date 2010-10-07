package message;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: rajith
 * Date: Sep 7, 2010
 * Time: 2:11:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageImpl {
    private Long id;
    private String name;
    private int age;

    public MessageImpl() {
    }

    public MessageImpl(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    

    @Override
    public String toString() {
        return "MessageImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    private List<String> nameList;
    private Set<Integer> ageSet;
    private Map<String, MessageImpl> messageMap;

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public Set<Integer> getAgeSet() {
        return ageSet;
    }

    public void setAgeSet(Set<Integer> ageSet) {
        this.ageSet = ageSet;
    }

    public Map<String, MessageImpl> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(Map<String, MessageImpl> messageMap) {
        this.messageMap = messageMap;
    }
}
