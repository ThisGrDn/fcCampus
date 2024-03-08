package fc.java.part2;

public class IfElseIfTest {
    public static void main(String[] args) {
        int score = 80;
        if(score>=0 && score<=100){
            if(score>=80) {
                if (score >= 90) {
                    System.out.println("A반");
                } else if (score >= 85) {
                    System.out.println("B반");
                } else if (score >= 80) {
                    System.out.println("C반");
                }
            }else{
                System.out.println("불합격");
            }
        }else{
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
