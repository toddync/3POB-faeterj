import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = in.nextInt();

            do {
                System.out.print(n + ", ");
                n--;
            } while (n > 0);

            System.out.println(n);
        }
    }
}