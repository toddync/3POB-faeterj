import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Nota: ");
            int n = in.nextInt();

            switch(n) {
                case 10, 9 -> System.out.println("conceito A");
                case 8, 7 -> System.out.println("conceito B");
                case 6, 5 -> System.out.println("conceito C");
                case 4, 3 -> System.out.println("conceito D");
                case 2, 1, 0 -> System.out.println("conceito E");
                default -> System.out.println("Nota inválida");
            }
        }
    }
}