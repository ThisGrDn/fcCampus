package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = -10;
        if(x >= 0){
            System.out.println("0 or 양수");
        }else{
            System.out.println("음수");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int su = scan.nextInt();
        if(su%2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt();
        if(num%12 == 0){
            System.out.println("12의 배수");
        }else{
            System.out.println("12의 배수가 아님");
        }

        System.out.print("년도를 입력하세요:");
        int years = scan.nextInt();
        if(((years%4==0) && (years%100!=0)) || (years%400==0) ){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
