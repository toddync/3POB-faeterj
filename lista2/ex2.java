import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Qual a sua idade? ");
            int i = in.nextInt();
            if (i < 18) {
                System.out.println("Menor de idade");
            } else if(i < 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }
    }
}