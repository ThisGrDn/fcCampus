package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        int x = 10;
        if(x > 0){
            System.out.println("양수");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt();
        if(num%7 == 0){
            System.out.println("num = " + num + "은 7의 배수입니다.");
        }

        System.out.print("나이를 입력하세요:");
        int age = scan.nextInt();
        if(age>=19){
            System.out.println("성인입니다.");
        }
        System.out.println("종료");
    }
}
