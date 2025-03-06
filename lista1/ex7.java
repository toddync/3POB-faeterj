import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("base = ");
            float base = in.nextFloat();
            System.out.print("altura = ");
            float altura = in.nextFloat();
            System.out.println("area = " + (base * altura));
            System.out.println("perimetro = " + (2 * (base + altura)));
        }
    }
}