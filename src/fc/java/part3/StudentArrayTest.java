package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];

        std[0]=new Student("홍길동","컴공",25,"fhqht0638@naver.com",20230511,"010-1111-1111");
        std[1]=new Student("김길동","전기",45,"fhqht0638@naver.com",20230512,"010-1111-1112");
        std[2]=new Student("이길동","건축",65,"fhqht0638@naver.com",20230513,"010-1111-1113");
        std[3]=new Student("하길동","통신",35,"fhqht0638@naver.com",20230514,"010-1111-1114");

        for(Student s:std){
            System.out.println(s.toString());
        }
    }
}
