package gettersetter;

import java.util.UUID;

public class Person {
    
    private String name;
    
    private int age;
    
    private String address;
    
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
    
    /**
     * getter가 아닌 my로 시작하는 메서드
     */
    public String myAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * 별도의 프로퍼티가 없는 메서드
     */
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
