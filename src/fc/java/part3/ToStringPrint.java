package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo =new PersonVO("홍길동",50,"010-2131-2313");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        System.out.println(vo.toString());
        System.out.println(vo); // 자동적으로 toString을 사용함 vo.toString()
    }
}
