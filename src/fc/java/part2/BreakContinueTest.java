package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c={'s','h','u','t','d','o','w','n'};
        for(char i:c){
            if (i == 'o') break;
            System.out.println(i);
        }
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%3 != 0) continue;
            count++;

        }

        System.out.println("count = " + count);
    }
}
