package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //정수 6개를 저장할 배열
        int[] arr = new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=51;
        arr[3]=35;
        arr[4]=60;
        arr[5]=94;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //학생 객체를 설계하고 데이터를 저장한 후 출력
        Student std = new Student("홍길동","컴퓨터공학과",25,"fhqht0638@naver.com",20230511,"010-1111-1111");
        System.out.println(std.toString());
    }

}
