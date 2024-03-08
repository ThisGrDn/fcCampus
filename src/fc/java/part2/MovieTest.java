package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.day = "2022.12.14";
        m.actor = "제이크 설리";
        m.category = "액션";
        m.runt = 192;
        m.level = 12;

        System.out.println(m.title+"\t"+m.day+"\t"+m.actor+"\t"+ m.category+"\t"+ m.runt+"\t"+m.level);

    }
}
