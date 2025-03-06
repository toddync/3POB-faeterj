import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("raio = ");
            System.out.println("area = " + (Math.pow(in.nextFloat(), 2) * 3.14159));
        }
    }
}