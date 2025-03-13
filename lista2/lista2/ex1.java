import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Entre com um número: ");
            if (in.nextInt() % 2  == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é impar.");
            }
        }
    }
}