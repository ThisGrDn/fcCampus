package fc.java.part3;
import java.lang.*; // 생략 되어있음 default package
import java.util.Scanner;
import fc.java.model.CarDTO;

public class PackageNameTest {
    public static void main(java.lang.String[] args) {
        java.lang.String str="홍길동";
        java.util.Scanner scan=new java.util.Scanner(java.lang.System.in);
        java.lang.System.out.println("Hello World");

        fc.java.model.CarDTO car = new fc.java.model.CarDTO();
    }
}
