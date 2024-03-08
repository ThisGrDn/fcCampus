package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int x = 123;
        System.out.println("decimal = " + x);

        int y = 0b01111011;
        System.out.println("binary = " + y);

        int z = 0173;
        System.out.println("octal = " + z);

        int u = 0x7B;
        System.out.println("hexa = " + u);

        int data = 123;
        String binary =Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        // 0b1111011
        String octal = Integer.toOctalString(data);
        System.out.println("octal = " + octal);
        // 0173
        String hexa = Integer.toHexString(data);
        System.out.println("hexa = " + hexa);
        // 0x7B

    }
}
