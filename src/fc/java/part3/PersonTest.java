package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        fc.java.part3.Person p; //디렉토리가 같기 때문
        p = new Person();

        //인스턴스를 만드는 과정
        Person pp = new Person();

        p.name="홍길동";
        p.age=30;
        p.phone="010-1111-1111";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
