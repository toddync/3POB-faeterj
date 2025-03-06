import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("R$ = ");
            System.out.println("US$ = " + (in.nextFloat() /  5.75));
        }
    }
}