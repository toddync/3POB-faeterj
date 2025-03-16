import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("x = ");
            int x = in.nextInt();
            for(int i = 1; i < 11; i++)
                System.out.println(x + " * " + i + " = " + (x*i));
        }
    }
}