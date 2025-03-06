import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("a = ");
            int a = in.nextInt();
            System.out.print("b = ");
            System.out.println("a + b = " + (in.nextInt() + a));
        }
    }
}