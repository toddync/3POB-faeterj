import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("ano: ");
            int ano = in.nextInt();
            
            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if(ano % 400 == 0) {
                        System.out.println("É bissexto");
                    } else {
                        System.out.println("Não é bissexto");
                    }
                } else {
                    System.out.println("É bissexto");
                }
            } else {
                System.out.println("Não é bissexto");
            }
        }
    }
}