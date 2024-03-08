package fc.java.model;

import fc.java.part3.Person;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메소드(default constructor)
    public PersonVO(){
    }
    public PersonVO(String name, int age, String phone){
        //객체의 초기화를 한다.
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getName(){
        return name; //this.name
    }
    public int getAge(){
        return age; //this.age
    }
    public String getPhone(){
        return phone; //this.phone
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
