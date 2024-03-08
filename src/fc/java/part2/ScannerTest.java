package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt(); //블럭 상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat(); //블럭 상태
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요:");
        String s = scan.next(); //블럭 상태
        System.out.println("s = " + s);

        scan.nextLine(); // 스트림비우기 버퍼비우기

        System.out.print("문자열을 입력하세요:");
        String s1 = scan.nextLine(); //블럭 상태
        System.out.println("s1 = " + s1);

        scan.close();
    }
}
