package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[1] = new Movie();
        m[2] = new Movie();

        m[0].title = "아바타";
        m[0].day = "2022.11.22";
        m[0].runt = 192;
        m[0].actor = "박매일";
        m[0].category = "액션";
        m[0].level = 12;

        m[1].title = "서울의 밤";
        m[1].day = "2022.11.22";
        m[1].runt = 192;
        m[1].actor = "박매일";
        m[1].category = "액션";
        m[1].level = 12;

        m[2].title = "인셉션";
        m[2].day = "2022.11.22";
        m[2].runt = 192;
        m[2].actor = "박매일";
        m[2].category = "액션";
        m[2].level = 12;

        for(int i=0; i<m.length; i++){
            System.out.println(m[i].title+"\t"+m[i].day+"\t"+m[i].runt+"\t"+m[i].actor+"\t"+m[i].category+"\t"+m[i].level+"\t");
        }
    }
}
