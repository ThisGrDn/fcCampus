package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args){

        
        int[][] a={
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
