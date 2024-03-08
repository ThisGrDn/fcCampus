package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v =add(35.6f,56.7f);
        System.out.println("v = " + v);

        int vv =add(10,50);
        System.out.println("vv = " + vv);
    }

    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }

    public static float add(float x, float y){
        float sum = x+y;
        return sum;
    }
}
