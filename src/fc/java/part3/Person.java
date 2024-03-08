package fc.java.part3;
//  객체=상태정보+행위정보 (멤버변수+멤버메소드)
public class Person {
    public String name;
    public int age;
    public String phone;
    // 기본 생성자 메소드
    public Person(){

    }
    public void play(){
        System.out.println("운동을 한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다.");
    }
}
