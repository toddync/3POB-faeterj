import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("raio = ");
            System.out.println("V = " + ((4/3) * 3.14159 * Math.pow(in.nextFloat(), 3)));
        }
    }
}