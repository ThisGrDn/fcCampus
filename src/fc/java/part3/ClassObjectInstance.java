package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // object 객체
        Student st2;
        Student st3;

        //  instance 실체
        st1 = new Student("홍길동","컴공",25,"fhqht0638@naver.com",20230511,"010-1111-1111"); // instance 실체
        st2 = new Student("김길동","전기",45,"fhqht0638@naver.com",20230512,"010-1111-1112");
        st3 = new Student("이길동","건축",65,"fhqht0638@naver.com",20230513,"010-1111-1113");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
