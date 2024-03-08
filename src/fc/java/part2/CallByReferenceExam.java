package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};

        int sum = addArray(a);
        System.out.println("sum = " + sum);
    }

    public static int addArray(int[] a){
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        return sum;
    }
}
