import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("a = ");
            int a = in.nextInt(), c = 0;
            System.out.print("b = ");
            int b = in.nextInt();

            for (; a <= b; a++) {
                for (int i = 2; i < a; i++)
                    if (a % i == 0) {
                        c = 1;
                        break;
                    }
                if (c == 0) {
                    System.out.println(a + " ");
                }
                c = 0;
            }
        }
    }
}