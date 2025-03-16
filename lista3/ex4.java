import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("quantidade de alunos: ");
            int m = 0, c = in.nextInt();

            for (int i = 0; i < c; i++) {
                System.out.print((i + 1) + "° nota: ");
                m += in.nextInt();
            }

            System.out.println("Media: " + (m / c));
        }
    }
}