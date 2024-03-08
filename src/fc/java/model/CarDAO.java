package fc.java.model;

public class CarDAO {
    // C.R.U.D
    // Create = Insert(저장)
    public void carInsert(CarDTO car){
        //DB 연결 insert SQL
        System.out.println("car정보가 DB에 저장됨");
    }

    public void carSelect(CarDTO car){
        System.out.println("car정보가 출력됨");
    }
}
