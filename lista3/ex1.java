import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("N = ");
            int i = in.nextInt(), c = 0;

            for (int j = 1; j < i; j++) {
                c += j;
                System.out.print(j+", ");
            }
            System.out.println(i);
            System.out.println("Soma = " + (c + i));
        }
    }
}