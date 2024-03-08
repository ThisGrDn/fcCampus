package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로부터 입력받아 DB에 저장
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine(); //버퍼 비우기

        System.out.print("자동차 이름:");
        String carName = scan.nextLine();

        System.out.print("자동차 가격:");
        int carPrice = scan.nextInt();

        scan.nextLine(); //버퍼 비우기

        System.out.print("자동차 소유자:");
        String carOwner = scan.nextLine();

        System.out.print("자동차 연식:");
        int carYear = scan.nextInt();

        scan.nextLine(); //버퍼 비우기

        System.out.print("자동차 타입:");
        String carType = scan.nextLine();

        CarDTO c = new CarDTO();
        c.carSn=carSn;
        c.carName=carName;
        c.carPrice=carPrice;
        c.carOwner=carOwner;
        c.carYear=carYear;
        c.carType=carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(c);
        dao.carSelect(c);
    }
}
