package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO pvo = new PersonVO();
        //pvo.name = "홍길동";
       // pvo.age = 3000;     //정보 은닉이 필요함 접근제어가 필요함
       // pvo.phone = "010-2133-3212";

        pvo.setName("홍길동");
        pvo.setAge(50);
        pvo.setPhone("010-2134-1531");

        System.out.println(pvo.getName()+pvo.getAge()+pvo.getPhone());
    }
}
