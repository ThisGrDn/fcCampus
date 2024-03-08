package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        PersonVO vo1 = new PersonVO();
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
    }
}
