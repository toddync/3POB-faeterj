import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("idade: ");
            System.out.println("Aprox. " + (in.nextInt() *365) + " dias");
        }
    }
}