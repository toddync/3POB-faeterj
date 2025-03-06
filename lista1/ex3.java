import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("C = ");
            System.out.println("F = " + ((in.nextFloat() * 9/5) + 32));
        }
    }
}