package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a= 56.7f;
        float b= 143.6f;

        floatAdd(a,b);
    }

    public static void floatAdd(float a, float b){
        float sum = a+b;
        System.out.println("sum = " + sum);
    }

}
