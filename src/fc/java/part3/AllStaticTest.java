package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        //AllStatic st = new AllStatic(); //private 생성자를 했기때문에 오류
        //System.out.println(st.hap(10,20)); // 접근 방법이 이상하다 st.hap이 표시되지않는다.
        //System.out.println(st.max(10,20));
        //System.out.println(st.min(10,20));

        System.out.println(AllStatic.hap(10,20));   // 바람직
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.min(10,20));

        // Math m = new Math();
        System.out.println(Math.max(10,20)); // AllStatic 클래스인 Math 클래스
        System.out.println(Math.min(10,20));
    }
}
