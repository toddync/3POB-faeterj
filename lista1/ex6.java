import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("salario = ");
            float sal = in.nextFloat();
            System.out.print("inss (%) = ");
            float inss = in.nextFloat();
            System.out.println("val. liquido = " + (sal - sal * (inss/100)));
        }
    }
}